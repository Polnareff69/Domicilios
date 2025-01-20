package com.gym.One.JWT;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.security.Key;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Service
public class JWTService {

    // Genera la clave secreta para HMAC-SHA-256
    SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    // Convierte la clave en Base64 para representarla como un String
    String SECRET_KEY = Base64.getEncoder().encodeToString(key.getEncoded());

    public String getToken(UserDetails User){
        return getToken(new HashMap<>(), User);
    }

    public String getToken(Map<String,Object> ExtraClaims, UserDetails user){
        return Jwts.builder().setClaims(ExtraClaims).setSubject(user.getUsername()).setIssuedAt(new Date(System.currentTimeMillis())).setExpiration(new Date(System.currentTimeMillis()+1000*60*14)).signWith(getKey(), SignatureAlgorithm.HS256).compact();
    }

    private Key getKey(){
        byte[] keybytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keybytes);
    }
}
