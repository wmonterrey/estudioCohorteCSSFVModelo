package ni.com.sts.estudioCohorteCSSFV.modelo;

// Generated 26-feb-2015 20:57:39 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OrdenLaboratorio generated by hbm2java
 */
@Entity
@Table(name = "orden_laboratorio", schema = "public")
public class OrdenLaboratorio implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4105557079339694380L;
	private int secOrdenLaboratorio;
	private HojaConsulta hojaConsulta;
	private int numOrdenLaboratorio;
	private String examen;
	private char estado;
	private char tomaMx;
	private String fechaHoraTomaMx;
	private String fechaHoraCancela;
	private String razonCancela;
	private Short usuarioCancela;
	private Set<InfluenzaMuestra> influenzaMuestras = new HashSet<InfluenzaMuestra>(0);
	private Set<EgoResultados> egoResultadoses = new HashSet<EgoResultados>(0);
	private Set<SerologiaDengueMuestra> serologiaDengueMuestras = new HashSet<SerologiaDengueMuestra>(0);
	private Set<SerologiaChikMuestra> serologiaChikMuestras = new HashSet<SerologiaChikMuestra>(0);

	public OrdenLaboratorio() {
	}

	public OrdenLaboratorio(int secOrdenLaboratorio, HojaConsulta hojaConsulta,
			int numOrdenLaboratorio, String examen, char estado, char tomaMx) {
		this.secOrdenLaboratorio = secOrdenLaboratorio;
		this.hojaConsulta = hojaConsulta;
		this.numOrdenLaboratorio = numOrdenLaboratorio;
		this.examen = examen;
		this.estado = estado;
		this.tomaMx = tomaMx;
	}

	public OrdenLaboratorio(int secOrdenLaboratorio, HojaConsulta hojaConsulta,
			int numOrdenLaboratorio, String examen, char estado, char tomaMx,
			Set<InfluenzaMuestra> influenzaMuestras,
			Set<EgoResultados> egoResultadoses, Set<PerifericoResultado> perifericoResultados,
			Set<SerologiaDengueMuestra> serologiaDengueMuestras, Set<SerologiaChikMuestra> serologiaChikMuestras) {
		this.secOrdenLaboratorio = secOrdenLaboratorio;
		this.hojaConsulta = hojaConsulta;
		this.numOrdenLaboratorio = numOrdenLaboratorio;
		this.examen = examen;
		this.estado = estado;
		this.tomaMx = tomaMx;
		this.influenzaMuestras = influenzaMuestras;
		this.egoResultadoses = egoResultadoses;
		this.serologiaDengueMuestras = serologiaDengueMuestras;
		this.serologiaChikMuestras = serologiaChikMuestras;
	}

	@Id
	@SequenceGenerator(name = "id_orden_laboratorio_sec", sequenceName = "orden_laboratorio_sec_orden_laboratorio_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_orden_laboratorio_sec")
	@Column(name = "sec_orden_laboratorio", unique = true, nullable = false)
	public int getSecOrdenLaboratorio() {
		return this.secOrdenLaboratorio;
	}

	public void setSecOrdenLaboratorio(int secOrdenLaboratorio) {
		this.secOrdenLaboratorio = secOrdenLaboratorio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sec_hoja_consulta", nullable = false)
	public HojaConsulta getHojaConsulta() {
		return this.hojaConsulta;
	}

	public void setHojaConsulta(HojaConsulta hojaConsulta) {
		this.hojaConsulta = hojaConsulta;
	}

	@Column(name = "num_orden_laboratorio", nullable = false)
	public int getNumOrdenLaboratorio() {
		return this.numOrdenLaboratorio;
	}

	public void setNumOrdenLaboratorio(int numOrdenLaboratorio) {
		this.numOrdenLaboratorio = numOrdenLaboratorio;
	}

	@Column(name = "examen", nullable = false, length = 32)
	public String getExamen() {
		return this.examen;
	}

	public void setExamen(String examen) {
		this.examen = examen;
	}

	@Column(name = "estado", nullable = false, length = 1)
	public char getEstado() {
		return this.estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	@Column(name = "tomamx", nullable = true, length = 1)
	public char getTomaMx() {
		return tomaMx;
	}

	public void setTomaMx(char tomaMx) {
		this.tomaMx = tomaMx;
	}

	@Column(name = "fechaHoraMx", nullable = true, length = 19)
	public String getFechaHoraTomaMx() {
		return fechaHoraTomaMx;
	}

	public void setFechaHoraTomaMx(String fechaHoraTomaMx) {
		this.fechaHoraTomaMx = fechaHoraTomaMx;
	}
	
	@Column(name = "fecha_hora_cancela", nullable = true, length = 19)
	public String getFechaHoraCancela() {
		return fechaHoraCancela;
	}

	public void setFechaHoraCancela(String fechaHoraCancela) {
		this.fechaHoraCancela = fechaHoraCancela;
	}

	@Column(name = "razon_cancela", nullable = true, length = 100)
	public String getRazonCancela() {
		return razonCancela;
	}

	public void setRazonCancela(String razonCancela) {
		this.razonCancela = razonCancela;
	}

	@Column(name = "usuario_cancela", nullable = false)	
	public Short getUsuarioCancela() {
		return usuarioCancela;
	}

	public void setUsuarioCancela(Short usuarioCancela) {
		this.usuarioCancela = usuarioCancela;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ordenLaboratorio")
	public Set<InfluenzaMuestra> getInfluenzaMuestras() {
		return this.influenzaMuestras;
	}

	public void setInfluenzaMuestras(Set<InfluenzaMuestra> influenzaMuestras) {
		this.influenzaMuestras = influenzaMuestras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ordenLaboratorio")
	public Set<EgoResultados> getEgoResultadoses() {
		return this.egoResultadoses;
	}

	public void setEgoResultadoses(Set<EgoResultados> egoResultadoses) {
		this.egoResultadoses = egoResultadoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ordenLaboratorio")
	public Set<SerologiaDengueMuestra> getSerologiaDengueMuestras() {
		return this.serologiaDengueMuestras;
	}

	public void setSerologiaDengueMuestras(Set<SerologiaDengueMuestra> serologiaDengueMuestras) {
		this.serologiaDengueMuestras = serologiaDengueMuestras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ordenLaboratorio")
	public Set<SerologiaChikMuestra> getSerologiaChikMuestras() {
		return this.serologiaChikMuestras;
	}

	public void setSerologiaChikMuestras(Set<SerologiaChikMuestra> serologiaChikMuestras) {
		this.serologiaChikMuestras = serologiaChikMuestras;
	}

}
