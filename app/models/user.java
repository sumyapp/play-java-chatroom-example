package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.net.URL;

@Entity
public class User extends Model {

    @Id
    public String email;
    public String name;
    public String password;
    public String avatarURL;
    
    public User(String email, String name, String password, String avatarURL) {
      this.email = email;
      this.name = name;
      this.password = password;
      this.avatarURL = avatarURL;
    }

    public static Finder<String,User> find = new Finder<String,User>(
        String.class, User.class
    );

    public URL getAvatarURL() {
      String url = this.avatarURL;
      if (this.avatarURL) {
        return new URL(this.avatarURL);
      } else {
        return null;
      }
    }
}
