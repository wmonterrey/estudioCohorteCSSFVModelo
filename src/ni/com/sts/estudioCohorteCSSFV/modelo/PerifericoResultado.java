package ni.com.sts.estudioCohorteCSSFV.modelo;

// Generated Mar 10, 2015 10:29:10 AM by Hibernate Tools 4.0.0

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PerifericoResultado generated by hbm2java
 */
@Entity
@Table(name = "periferico_resultado")
public class PerifericoResultado implements java.io.Serializable {

	private int secPerifericoResultado;
	private int secOrdenLaboratorio;
	private String anisocitosis;
	private String anisocromia;
	private String poiquilocitosis;
	private String linfocitosAtipicos;
	private String observacionSblanca;
	private String observacionPlaqueta;
	private String codigoMuestra;
	private Short usuarioBioanalista;
	private Date horaReporte;
	private Character estado;

	public PerifericoResultado() {
	}

	public PerifericoResultado(int secPerifericoResultado,
			int secOrdenLaboratorio) {
		this.secPerifericoResultado = secPerifericoResultado;
		this.secOrdenLaboratorio = secOrdenLaboratorio;
	}

	public PerifericoResultado(int secPerifericoResultado,
			int secOrdenLaboratorio, String anisocitosis, String anisocromia,
			String poiquilocitosis, String linfocitosAtipicos,
			String observacionSblanca, String observacionPlaqueta,
			String codigoMuestra, Short usuarioBioanalista, Date horaReporte,
			Character estado) {
		this.secPerifericoResultado = secPerifericoResultado;
		this.secOrdenLaboratorio = secOrdenLaboratorio;
		this.anisocitosis = anisocitosis;
		this.anisocromia = anisocromia;
		this.poiquilocitosis = poiquilocitosis;
		this.linfocitosAtipicos = linfocitosAtipicos;
		this.observacionSblanca = observacionSblanca;
		this.observacionPlaqueta = observacionPlaqueta;
		this.codigoMuestra = codigoMuestra;
		this.usuarioBioanalista = usuarioBioanalista;
		this.horaReporte = horaReporte;
		this.estado = estado;
	}

	@Id
	@SequenceGenerator(name = "id_periferico_resultado_sec", sequenceName = "periferico_resultado_sec_periferico_resultado_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_periferico_resultado_sec")
	@Column(name = "sec_periferico_resultado", unique = true, nullable = false)
	public int getSecPerifericoResultado() {
		return this.secPerifericoResultado;
	}

	public void setSecPerifericoResultado(int secPerifericoResultado) {
		this.secPerifericoResultado = secPerifericoResultado;
	}

	@Column(name = "sec_orden_laboratorio", nullable = false)
	public int getSecOrdenLaboratorio() {
		return this.secOrdenLaboratorio;
	}

	public void setSecOrdenLaboratorio(int secOrdenLaboratorio) {
		this.secOrdenLaboratorio = secOrdenLaboratorio;
	}

	@Column(name = "anisocitosis", length = 32)
	public String getAnisocitosis() {
		return this.anisocitosis;
	}

	public void setAnisocitosis(String anisocitosis) {
		this.anisocitosis = anisocitosis;
	}

	@Column(name = "anisocromia", length = 32)
	public String getAnisocromia() {
		return this.anisocromia;
	}

	public void setAnisocromia(String anisocromia) {
		this.anisocromia = anisocromia;
	}

	@Column(name = "poiquilocitosis", length = 32)
	public String getPoiquilocitosis() {
		return this.poiquilocitosis;
	}

	public void setPoiquilocitosis(String poiquilocitosis) {
		this.poiquilocitosis = poiquilocitosis;
	}

	@Column(name = "linfocitos_atipicos", length = 32)
	public String getLinfocitosAtipicos() {
		return this.linfocitosAtipicos;
	}

	public void setLinfocitosAtipicos(String linfocitosAtipicos) {
		this.linfocitosAtipicos = linfocitosAtipicos;
	}

	@Column(name = "observacion_sblanca", length = 64)
	public String getObservacionSblanca() {
		return this.observacionSblanca;
	}

	public void setObservacionSblanca(String observacionSblanca) {
		this.observacionSblanca = observacionSblanca;
	}

	@Column(name = "observacion_plaqueta", length = 64)
	public String getObservacionPlaqueta() {
		return this.observacionPlaqueta;
	}

	public void setObservacionPlaqueta(String observacionPlaqueta) {
		this.observacionPlaqueta = observacionPlaqueta;
	}

	@Column(name = "codigo_muestra", length = 50)
	public String getCodigoMuestra() {
		return this.codigoMuestra;
	}

	public void setCodigoMuestra(String codigoMuestra) {
		this.codigoMuestra = codigoMuestra;
	}

	@Column(name = "usuario_bioanalista")
	public Short getUsuarioBioanalista() {
		return this.usuarioBioanalista;
	}

	public void setUsuarioBioanalista(Short usuarioBioanalista) {
		this.usuarioBioanalista = usuarioBioanalista;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "hora_reporte", length = 29)
	public Date getHoraReporte() {
		return this.horaReporte;
	}

	public void setHoraReporte(Date horaReporte) {
		this.horaReporte = horaReporte;
	}

	@Column(name = "estado", length = 1)
	public Character getEstado() {
		return this.estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

}
