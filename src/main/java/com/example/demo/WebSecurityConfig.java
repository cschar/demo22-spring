package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	
	    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .antMatchers("/hello").authenticated()
//                .anyRequest().authenticated()
                .and()
            .formLogin() //for .authenticated() ending
                .loginPage("/login").permitAll()
                .and()
            .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/");
//            .logout()
//                .permitAll();
//        http
//        .authorizeRequests()
//        .antMatchers("/webjars/**").permitAll()
//        .antMatchers("/", "/home").permitAll()
//        .antMatchers("/admin/**").hasRole("ADMIN")                                      
//        .anyRequest().fullyAuthenticated()
//        .and()
//        .formLogin().loginPage("/login").failureUrl("/login?error").permitAll()
//        .and()
//        .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/");
    }
    
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//      http.authorizeRequests()
//            .antMatchers("/login", "/error","/").permitAll()
//            .antMatchers("/**").authenticated()
//          .and().exceptionHandling()
//            .authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/login"));
//    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");
        auth.inMemoryAuthentication()
        		.withUser("u").password("p").roles("USER");
    }
}