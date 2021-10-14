package ai.ecma.apppaymesavingaccount.config;

import lombok.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest httpServletRequest,
                                    @NonNull HttpServletResponse httpServletResponse,
                                    @NonNull FilterChain filterChain) throws ServletException, IOException {
        try {
            //LOGIC FOR JWT
            System.out.println("JWT FILTER WORKING");
        } catch (Exception ex) {
            System.err.println("Error");
        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
