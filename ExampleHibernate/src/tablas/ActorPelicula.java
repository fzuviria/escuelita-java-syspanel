package tablas;
// Generated 16/08/2018 17:29:45 by Hibernate Tools 5.1.0.Alpha1

/**
 * ActorPelicula generated by hbm2java
 */
public class ActorPelicula implements java.io.Serializable {

	private Integer id;
	private Actor actor;
	private Pelicula pelicula;

	public ActorPelicula() {
	}

	public ActorPelicula(Actor actor, Pelicula pelicula) {
		this.actor = actor;
		this.pelicula = pelicula;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Actor getActor() {
		return this.actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Pelicula getPelicula() {
		return this.pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

}
