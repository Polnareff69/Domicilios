package com.gym.One.Auth;
import com.gym.One.Entity.Cliente;
import com.gym.One.Entity.Usuario;
import com.gym.One.JWT.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {


    private RegistroService registroService;

    private JWTService jwtService;

    public AuthResponse login(LoginRequest request){
        return null;
    }

    public AuthResponse register(RegisterRequest request){
        Usuario usuario = registroService.registrarClienteYUsuario(request.getNombre(), request.getDireccion(), request.getCorreo(), request.getPassword());
        AuthResponse respuesta = new AuthResponse(jwtService.getToken(usuario));

        return null;
    }
}
