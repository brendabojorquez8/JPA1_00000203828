package entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Achievement extends EntityBase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(nullable = false, name = "name", length = 500)
    private String name;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "videogame_id", nullable = false)
    private Videogame videogame;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Videogame getVideogame() {
        return videogame;
    }

    public void setVideogame(Videogame videogame) {
        this.videogame = videogame;
    }

    @Override
    public String toString() {
        return "entities.Achievement[ id=" + this.getId() + " ]";
    }
}
