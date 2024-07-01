package lorenzofoschetti.u5d11.security;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lorenzofoschetti.u5d11.entities.Dipendente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTTools {
    @Value("${jwt.secret}")
    private String secret;

    //con questo metodo andiamo a creare un token dato un determinato user(dipendente)
    public String createToken(Dipendente user) {
        return Jwts.builder()
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 7))
                .subject(String.valueOf(user.getId()))
                .signWith(Keys.hmacShaKeyFor(secret.getBytes()))
                .compact();
    }
}
