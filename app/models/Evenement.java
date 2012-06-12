package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Evenement extends Model {

	@Id
	public Long id;

	@Required
	public String titre;
	
	public String lieu;
	
	public String descriptif;
	
	@Required
	public String createur;
	
	public String mail;

	public static Finder<Long,Evenement> find = new Finder(
			Long.class, Evenement.class
			);

	public static List<Evenement> all() {
		return find.all();
	}

	public static void create(Evenement evt) {
		evt.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}

}