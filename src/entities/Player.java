package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Player implements Serializable {

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Collection<Videogame> videogames;
    @Column(nullable = false, unique = true)
    private String nickname;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Player[ id=" + id + " ]";
    }
}
