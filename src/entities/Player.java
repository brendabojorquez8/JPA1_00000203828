package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Player extends EntityBase implements Serializable {

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Collection<Videogame> videogames;
    @Column(nullable = false, unique = true)
    private String nickname;

    public Player() {
        this.videogames = new HashSet();
    }

    public Collection<Videogame> getVideogames() {
        return videogames;
    }

    public void setVideogames(Collection<Videogame> videogames) {
        this.videogames = videogames;
    }

    public void addVideogame(Videogame videogame) {
        this.videogames.add(videogame);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "entities.Player[ id=" + this.getId() + " ]";
    }
}
