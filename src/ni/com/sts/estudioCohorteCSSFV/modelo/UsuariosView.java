package ni.com.sts.estudioCohorteCSSFV.modelo;

// Generated 11-mar-2015 20:35:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UsuariosView generated by hbm2java
 */
@Entity
@Table(name = "usuarios_view")
public class UsuariosView implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private String usuario;
	private String codigoPersonal;
	
	@Id
	@Column(name = "id", unique = true, nullable = false, updatable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nombre", nullable = false, updatable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name = "usuario", nullable = false, updatable = false)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	@Column(name = "codigopersonal", nullable = false, updatable = false)
	public String getCodigoPersonal() {
		return this.codigoPersonal;
	}

	public void setCodigoPersonal(String codigoPersonal) {
		this.codigoPersonal = codigoPersonal;
	}

}
