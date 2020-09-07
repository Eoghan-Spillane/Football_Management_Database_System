package Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Model.League;
import Model.Manager;
import Model.Player;
import Model.Team;

public class controller {
	
	//ij
	//connect 'jdbc:derby:footballDatabase';
	
	//-----------------------
	//	ADD
	//-----------------------
	/***
	 * Add a League To the the database
	 * @param leagueName the name of the league
	 */
	public void addLeague(String leagueName) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		 
		League league = new League();
		league.setName(leagueName);
		entitymanager.persist(league);
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
	
	/***
	 * Create a New Player
	 * @param name Player's name
	 * @param phone Player's Phone No
	 * @param goals Player's Goals, either goals scored or blocked
	 * @param goalie True if they're a goalie
	 */
	public void addPlayer(String name, String phone, int goals, boolean goalie) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		 
		Player player = new Player();
		player.setName(name);
		player.setGoalie(goalie);
		player.setGoals(goals);
		player.setPhone(phone);
		
		entitymanager.persist(player);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
	
	/**
	 * Add a new Team
	 * @param text Team Name
	 * @param colour Team
	 */
	public void addTeam(String text, String colour) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		 
		Team team = new Team();
		team.setName(text);
		team.setColour(colour);
		
		entitymanager.persist(team);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
		
	public void addManager(String name, String phone, int rating, String dob) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		 
		Manager manager = new Manager();
		manager.setName(name);
		manager.setPhone(phone);
		manager.setDob(dob);
		manager.setRating(rating);
		
		entitymanager.persist(manager);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
	
	
	
	
	
	//-----------------------
	//	Remove
	//-----------------------
	
	public void removePlayer(String name) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		 
		Player player = entitymanager.find(Player.class, name);
		
		entitymanager.remove(player);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

	public void removeTeam(String text) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		 
		Team team = entitymanager.find(Team.class, text);

		
		entitymanager.remove(team);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
	
	public void removeManager(String name) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		 
		Manager manager = entitymanager.find(Manager.class, name);
		
		entitymanager.remove(manager);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

	public void removeLeague(String name) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		 
		League manager = entitymanager.find(League.class, name);
		
		entitymanager.remove(manager);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
	
	
	
	//-----------------------
	//	List
	//-----------------------
	
	@SuppressWarnings("unchecked")
	public List<Manager> getManagersbyName() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		
		
		//List<EmailDomainTrust> ListOfEmailDomains = entityManager.createQuery("SELECT e FROM EmailDomainTrust e").getResultList();
		List<Manager> list = entitymanager.createQuery("Select e from Manager e order by e.name").getResultList();
				
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Manager> getManagersbyRating() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		
		
		//List<EmailDomainTrust> ListOfEmailDomains = entityManager.createQuery("SELECT e FROM EmailDomainTrust e").getResultList();
		List<Manager> list = entitymanager.createQuery("Select e from Manager e order by e.rating").getResultList();
				
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Player> getPlayersByName() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		
		
		//List<EmailDomainTrust> ListOfEmailDomains = entityManager.createQuery("SELECT e FROM EmailDomainTrust e").getResultList();
		List<Player> list = entitymanager.createQuery("Select e from Player e order by e.name").getResultList();
				
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Team> getTeamsbyName() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		
		
		//List<EmailDomainTrust> ListOfEmailDomains = entityManager.createQuery("SELECT e FROM EmailDomainTrust e").getResultList();
		List<Team> list = entitymanager.createQuery("Select e from Team e order by e.name").getResultList();
				
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<League> getLeaguesbyName() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		
		
		List<League> list = entitymanager.createQuery("Select e from League e order by e.name").getResultList();
				
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

		return list;
	}
	
	//-----------------------------------
	//	Team/Leage Assignment/Filter
	//-----------------------------------
	
	public void addPlayerTeam(Player p1) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		 
		entitymanager.persist(p1);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
	
	public void addManagerTeam(Manager m1) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		 
		entitymanager.persist(m1);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
	
	public void addTeamLeague(Team t1) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		 
		entitymanager.persist(t1);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Player> getPlayersByTeam(String teamName) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		
		
		//List<EmailDomainTrust> ListOfEmailDomains = entityManager.createQuery("SELECT e FROM EmailDomainTrust e").getResultList();
		//String query = "Select e from Player e order by e.name where e.teamName= :newTeam";
		//query.setParameter
		List<Player> list = entitymanager.createQuery("Select e from Player e where e.teamName= :teamName order by e.name").setParameter("teamName", teamName).getResultList();
				
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Player> getPlayersBySearch(String SName) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		
		
		//List<EmailDomainTrust> ListOfEmailDomains = entityManager.createQuery("SELECT e FROM EmailDomainTrust e").getResultList();
		//String query = "Select e from Player e order by e.name where e.teamName= :newTeam";
		//query.setParameter
		List<Player> list = entitymanager.createQuery("Select e from Player e where e.name= :teamName").setParameter("teamName", SName).getResultList();
				
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

		return list;
	}
	
	public Player getPlayerSearch(String name) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		
		
		Player p = entitymanager.find(Player.class, name);
				
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

		return p;
	}
	
	public void newEditPlayer(String name, String phone, int goals, boolean goalie, String email, String team) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FootballDatabase" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( ); 
		 
		Player player = new Player();
		player.setName(name);
		player.setGoalie(goalie);
		player.setGoals(goals);
		player.setPhone(phone);
		player.setTeam(team);
		player.setEmail(email);
		
		entitymanager.persist(player);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}
