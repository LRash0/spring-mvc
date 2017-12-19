package br.com.casadocodigo.loja.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class User implements UserDetails {

    /**
     * 
     */
    private static final long serialVersionUID = -5532387495751020727L;
    @Id
    private String login;
    private String password;

    public void setPassword(String password) {
	this.password = password;
    }

    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
    @ColumnDefault(value = "ROLE_USER")
    private List<Role> roles = new ArrayList<>();

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
	// TODO Auto-generated method stub
	return roles;
    }

    @Override
    public String getPassword() {
	// TODO Auto-generated method stub
	return password;
    }

    @Override
    public String getUsername() {
	// TODO Auto-generated method stub
	return name;
    }

    @Override
    public boolean isAccountNonExpired() {
	// TODO Auto-generated method stub
	return true;
    }

    @Override
    public boolean isAccountNonLocked() {
	// TODO Auto-generated method stub
	return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
	// TODO Auto-generated method stub
	return true;
    }

    @Override
    public boolean isEnabled() {
	// TODO Auto-generated method stub
	return true;
    }

    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
    }

}
