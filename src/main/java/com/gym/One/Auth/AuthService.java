package com.gym.One.Auth;
import com.gym.One.Dao.UsuarioDao;
import com.gym.One.Entity.Cliente;
import com.gym.One.Entity.Usuario;
import com.gym.One.JWT.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private RegistroService registroService;
    @Autowired
    private JWTService jwtService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UsuarioDao UsuarioDao;

    public AuthResponse login(LoginRequest request){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user = UsuarioDao.findByNombre(request.getUsername()).orElseThrow();
        String token = jwtService.getToken(user);
        AuthResponse respuesta = new AuthResponse(token);
        return respuesta;
    }

    public AuthResponse register(RegisterRequest request){
        Usuario usuario = registroService.registrarClienteYUsuario(request.getNombre(), request.getDireccion(), request.getCorreo(), request.getPassword());
        AuthResponse respuesta = new AuthResponse(jwtService.getToken(usuario));
        return respuesta;
    }
}
