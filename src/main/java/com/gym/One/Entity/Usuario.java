package com.gym.One.Entity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.List;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // Esto hará que se genere automáticamente un UUID
    @Column(name = "usuarioid", updatable = false, nullable = false)  // La columna que representa el ID
    private UUID usuarioid;

    @OneToOne(fetch = FetchType.LAZY)  // Relación OneToOne
    @JoinColumn(name = "clienteid", nullable = false, unique = true)  // Relación con la tabla clientes
    private Cliente cliente;  // Asumiendo que tienes una entidad Cliente

    @Column(name = "correo", nullable = false, unique = true, length = 100)
    private String correo;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "rol", length = 50)
    private Rol rol;  // Valor por defecto 'USER'

    @Column(name = "nombre", length = 200)
    private String nombre;

    @Column(name = "direccion", length = 200)
    private String direccion;

    // Getters and Setters

    public UUID getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(UUID usuarioid) {
        this.usuarioid = usuarioid;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(rol.name()));
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
