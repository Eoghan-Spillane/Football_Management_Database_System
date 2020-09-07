//Eoghan Spillane
package View;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.*;

import Controller.controller;
import Model.League;
import Model.Manager;
import Model.Player;
import Model.Team;


public class Main extends Application{
	
	 controller ConRef = new controller();
	
	@Override
    public void start(Stage primaryStage) {
		
		//-----------------------------
		//	Add
		//-----------------------------
		
		 // Player
			GridPane playerAddGrid = new GridPane();
			playerAddGrid.setAlignment(Pos.TOP_LEFT);
			playerAddGrid.setHgap(10);
			playerAddGrid.setVgap(10);
			playerAddGrid.setPadding(new Insets(25, 25, 25, 25));
			
			
	        Text playCreate = new Text ("Create Player");
	        playCreate.setFont(Font.font("Verdana", FontWeight.BOLD, 20));      
	        playerAddGrid.add(playCreate, 0, 1, 10, 1);
	        
	        Label pnameLab = new Label("Name:  ");	playerAddGrid.add(pnameLab, 0, 2);
	        TextField pname = new TextField();		playerAddGrid.add(pname, 1, 2);
			
	        Label pPhoneLab = new Label("PhoneNo:  ");	playerAddGrid.add(pPhoneLab, 0, 3);
	        TextField pPhone = new TextField();		playerAddGrid.add(pPhone, 1, 3);
	        
	        Label pgoalLab = new Label("Goals: "); playerAddGrid.add(pgoalLab, 0, 4);
	        TextField pGoal = new TextField(); playerAddGrid.add(pGoal, 1, 4);
	        
	        Label pgoalieLab = new Label("Goalie: "); playerAddGrid.add(pgoalieLab, 0, 5);
	        CheckBox pGoalie = new CheckBox(); playerAddGrid.add(pGoalie, 1, 5);
	        
	        Button newPlayerButton = new Button("Add Player"); playerAddGrid.add(newPlayerButton, 1, 6);
	        
	        newPlayerButton.setOnAction(actionEvent -> {
	        	ConRef.addPlayer(pname.getText(), pPhone.getText(), Integer.parseInt(pGoal.getText()), pGoalie.isSelected());
	        	pname.clear(); pPhone.clear(); pGoal.clear();
	        });
	        
	        
			
        // League
	        GridPane leagueGrid = new GridPane();
			leagueGrid.setAlignment(Pos.TOP_LEFT);
			leagueGrid.setHgap(10);
			leagueGrid.setVgap(10);
			leagueGrid.setPadding(new Insets(25, 25, 25, 25));
			
			
	        Text leagueSection = new Text ("Create League");
	        leagueSection.setFont(Font.font("Verdana", FontWeight.BOLD, 20));      
	        leagueGrid.add(leagueSection, 0, 1, 10, 1);
	        
	        Label leagueLab = new Label("League Name:  ");	leagueGrid.add(leagueLab, 0, 2);
	        TextField lName = new TextField();		leagueGrid.add(lName, 1, 2);
				        
	        Button newLeague = new Button("Add League"); leagueGrid.add(newLeague, 1, 3);
	        
	        newLeague.setOnAction(actionEvent -> {
	        	ConRef.addLeague(lName.getText());
	        	lName.clear();
	        });
	        
	    // Team
	        GridPane teamGrid = new GridPane();
			teamGrid.setAlignment(Pos.TOP_LEFT);
			teamGrid.setHgap(10);
			teamGrid.setVgap(10);
			teamGrid.setPadding(new Insets(25, 25, 25, 25));
			
			
	        Text teamSection = new Text ("Create Team");
	        teamSection.setFont(Font.font("Verdana", FontWeight.BOLD, 20));      
	        teamGrid.add(teamSection, 0, 1, 10, 1);
	        
	        Label teamName = new Label("Team Name:  ");	teamGrid.add(teamName, 0, 2);
	        TextField rName = new TextField();		teamGrid.add(rName, 1, 2);
	        
	        Label teamColorLab = new Label("Colour:  ");	teamGrid.add(teamColorLab, 0, 3);
	        TextField tcolour = new TextField();		teamGrid.add(tcolour, 1, 3);
				        
	        Button newTeam = new Button("Add Team"); teamGrid.add(newTeam, 1, 4);
	        
	        newTeam.setOnAction(actionEvent -> {
	        	ConRef.addTeam(rName.getText(), tcolour.getText());
	        	rName.clear();tcolour.clear();
	        });
	        
	        
	        
	    // Manager
	        GridPane managerAddGrid = new GridPane();
			managerAddGrid.setAlignment(Pos.TOP_LEFT);
			managerAddGrid.setHgap(10);
			managerAddGrid.setVgap(10);
			managerAddGrid.setPadding(new Insets(25, 25, 25, 25));
			
			
	        Text mangerCreateTitle = new Text ("Create Manager");
	        mangerCreateTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 20));      
	        managerAddGrid.add(mangerCreateTitle, 0, 1, 10, 1);
	        
	        Label mnameLab = new Label("Name:  ");	managerAddGrid.add(mnameLab, 0, 2);
	        TextField mname = new TextField();		managerAddGrid.add(mname, 1, 2);
			
	        Label mPhoneLab = new Label("PhoneNo:  ");	managerAddGrid.add(mPhoneLab, 0, 3);
	        TextField mPhone = new TextField();		managerAddGrid.add(mPhone, 1, 3);
	        
	        Label mRatinglab = new Label("Rating: "); managerAddGrid.add(mRatinglab, 0, 4);
	        TextField mRating = new TextField(); managerAddGrid.add(mRating, 1, 4);
	        
	        Label mDOBLab = new Label("DOB: "); managerAddGrid.add(mDOBLab, 0, 5);
	        TextField mDOB = new TextField(); managerAddGrid.add(mDOB, 1, 5);
	        
	        Button newManager = new Button("Add Manger"); managerAddGrid.add(newManager, 1, 6);
	        
	        newManager.setOnAction(actionEvent -> {
	        	ConRef.addManager(mname.getText(), mPhone.getText(), Integer.parseInt(mRating.getText()), mDOB.getText());
	        	mname.clear();mPhone.clear();mRating.clear();mDOB.clear();
	        });
	        
	       
        VBox addGrid = new VBox(playerAddGrid, managerAddGrid, teamGrid, leagueGrid);
	    ScrollPane add = new ScrollPane(addGrid);
	    add.setFitToWidth(true);
        
		//-----------------------------
		//	Manage
		//-----------------------------
	    
	    GridPane manageGrid1 = new GridPane();
		
		// List All Players
			Text PlayerManager = new Text ("Player List");
	        PlayerManager.setFont(Font.font("Verdana", FontWeight.BOLD, 20));      
	        manageGrid1.add(PlayerManager, 0, 1, 10, 1);
	        
	        ListView<Player> playerList = new ListView<Player>();
	        playerList.setPrefSize(450, 130);
	        manageGrid1.add(playerList, 0, 2, 10, 2);
	        
	        Button removePlayer = new Button("RemovePlayer"); manageGrid1.add(removePlayer, 0, 4);
	        Button refreshPlayerList = new Button("RefreshALL"); manageGrid1.add(refreshPlayerList, 1, 4);
	        Button filterByTeam = new Button("Filter By Team"); manageGrid1.add(filterByTeam, 2, 4);
	        Button filterBySerach = new Button("Search"); manageGrid1.add(filterBySerach, 3, 4);
	        TextField searchName = new TextField(); manageGrid1.add(searchName, 4, 4);
	        
	        
	        removePlayer.setOnAction(ActionEvent -> {
	        	ConRef.removePlayer(playerList.getSelectionModel().getSelectedItem().getName());
	        	playerList.setItems((ObservableList<Player>) FXCollections.observableArrayList(ConRef.getPlayersByName() ));
	        });
	        
	        refreshPlayerList.setOnAction(ActionEvent -> {
	        	playerList.setItems((ObservableList<Player>) FXCollections.observableArrayList(ConRef.getPlayersByName() ));
	        });
	        
	        filterBySerach.setOnAction(ActionEvent ->{
	        	playerList.setItems((ObservableList<Player>) FXCollections.observableArrayList(ConRef.getPlayersBySearch(searchName.getText()) ));
	        });
	        
	        
        
        // List All Managers
	        Text ManagerListTitle = new Text ("Manager List");
	        ManagerListTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 20));      
	        manageGrid1.add(ManagerListTitle, 11, 1, 20, 1);
	        
	        ListView<Manager> managerList = new ListView<Manager>();
	        managerList.setPrefSize(400, 130);
	        manageGrid1.add(managerList, 11, 2, 20, 2);
	        
	        Button removeManager = new Button("RemoveManger"); manageGrid1.add(removeManager, 11, 4);
	        Button refreshManagerListbyName = new Button("RefreshByName"); manageGrid1.add(refreshManagerListbyName, 12, 4);
	        Button refreshManagerListbyRating = new Button("RefreshByRating"); manageGrid1.add(refreshManagerListbyRating, 13, 4);
	        
	        removeManager.setOnAction(ActionEvent -> {
	        	ConRef.removeManager(managerList.getSelectionModel().getSelectedItem().getName());
	        	managerList.setItems((ObservableList<Manager>) FXCollections.observableArrayList(ConRef.getManagersbyName() ));
	        });
	        
	        refreshManagerListbyName.setOnAction(ActionEvent -> {
	        	managerList.setItems((ObservableList<Manager>) FXCollections.observableArrayList(ConRef.getManagersbyName() ));
	        });
	        
	        refreshManagerListbyRating.setOnAction(ActionEvent -> {
	        	managerList.setItems((ObservableList<Manager>) FXCollections.observableArrayList(ConRef.getManagersbyRating() ));
	        });
        
	        
        //List All Teams
	        GridPane manageGrid2 = new GridPane();
	        
	        Text teamListTitle = new Text ("Team List");
	        teamListTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 20));      
	        manageGrid2.add(teamListTitle, 0, 1, 10, 1);
	        
	        ListView<Team> teamList = new ListView<Team>();
	        teamList.setPrefSize(450, 130);
	        manageGrid2.add(teamList, 0, 2, 10, 2);
	        
	        Button removeTeam = new Button("RemoveTeam"); manageGrid2.add(removeTeam, 0, 4);
	        Button addPlayerToTeam = new Button("Add Player To Team"); manageGrid2.add(addPlayerToTeam, 1, 4);
	        Button addManagerToTeam = new Button("Add Manager To Team"); manageGrid2.add(addManagerToTeam, 2, 4);
	        Button refreshTeam = new Button("Refresh Teams"); manageGrid2.add(refreshTeam, 3, 4);
	        
	        removeTeam.setOnAction(ActionEvent -> {
	        	ConRef.removeTeam(teamList.getSelectionModel().getSelectedItem().getName());
	        	teamList.setItems((ObservableList<Team>) FXCollections.observableArrayList(ConRef.getTeamsbyName() ));
	        });
	        
	        refreshTeam.setOnAction(ActionEvent -> {
	        	teamList.setItems((ObservableList<Team>) FXCollections.observableArrayList(ConRef.getTeamsbyName() ));
	        });
	        
	        addPlayerToTeam.setOnAction(ActionEvent -> {
	        	Player old = playerList.getSelectionModel().getSelectedItem();
	        	old.setTeam(teamList.getSelectionModel().getSelectedItem().getName());
	        	ConRef.removePlayer(playerList.getSelectionModel().getSelectedItem().getName() );
	        	ConRef.addPlayerTeam(old);
	        	playerList.setItems((ObservableList<Player>) FXCollections.observableArrayList(ConRef.getPlayersByName() ));
	        	
	        });
	        
	        addManagerToTeam.setOnAction(ActionEvent -> {
	        	Manager old = managerList.getSelectionModel().getSelectedItem();
	        	old.setTeam(teamList.getSelectionModel().getSelectedItem().getName());
	        	ConRef.removeManager(managerList.getSelectionModel().getSelectedItem().getName());
	        	ConRef.addManagerTeam(old);
	        	managerList.setItems((ObservableList<Manager>) FXCollections.observableArrayList(ConRef.getManagersbyName() ));
	        });
	        
	        filterByTeam.setOnAction(ActionEvent ->{
	        	playerList.setItems((ObservableList<Player>) FXCollections.observableArrayList(ConRef.getPlayersByTeam(teamList.getSelectionModel().getSelectedItem().getName()) ));
	        });
	        
	        
        //List All Leagues
	        Text LeagueListTitle = new Text ("League List");
	        LeagueListTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 20));      
	        manageGrid2.add(LeagueListTitle, 11, 1, 20, 1);
	        
	        ListView<League> leagueList = new ListView<League>();
	        leagueList.setPrefSize(400, 130);
	        manageGrid2.add(leagueList,  11, 2, 20, 2);
	        
			Button removeLeague = new Button("Remove League"); manageGrid2.add(removeLeague, 11, 4);
	        Button refreshLeague = new Button("Refresh League"); manageGrid2.add(refreshLeague, 12, 4);
	        Button addTeamtoLeague = new Button("Add Team To League"); manageGrid2.add(addTeamtoLeague, 13, 4);
	    
	        removeLeague.setOnAction(ActionEvent -> {
	        	ConRef.removeLeague(leagueList.getSelectionModel().getSelectedItem().getName());
	        	leagueList.setItems((ObservableList<League>) FXCollections.observableArrayList(ConRef.getLeaguesbyName()));
	        });
	        
	        refreshLeague.setOnAction(ActionEvent -> {
	        	leagueList.setItems((ObservableList<League>) FXCollections.observableArrayList(ConRef.getLeaguesbyName()));
	        });
	        
	        addTeamtoLeague.setOnAction(ActionEvent -> {
	        	Team old = teamList.getSelectionModel().getSelectedItem();
	        	old.setLeagueName(leagueList.getSelectionModel().getSelectedItem().getName());
	        	ConRef.removeTeam(teamList.getSelectionModel().getSelectedItem().getName());
	        	ConRef.addTeamLeague(old);
	        	teamList.setItems((ObservableList<Team>) FXCollections.observableArrayList(ConRef.getTeamsbyName() ));
	        });
	        
	    VBox manageGridBox = new VBox(manageGrid1, manageGrid2);
	    ScrollPane manage = new ScrollPane(manageGridBox);
	    manage.setFitToWidth(true);
        
        
        
		//-----------------------------
		//	Edit Player
		//-----------------------------
	    GridPane editGrid = new GridPane();
	    Text editPlayerTitle = new Text ("Edit Player");
        editPlayerTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 20));      
        editGrid.add(editPlayerTitle, 0, 1, 20, 1);
        
        Button filterBySerach1 = new Button("Search To Edit"); editGrid.add(filterBySerach1, 0, 2);
        TextField searchName1 = new TextField(); editGrid.add(searchName1, 1, 2);
        
        Label pnameLab1 = new Label("Name:  ");	editGrid.add(pnameLab1, 0, 4);
        TextField pname1 = new TextField();		editGrid.add(pname1, 1, 4);
		
        Label pPhoneLab1 = new Label("PhoneNo:  ");	editGrid.add(pPhoneLab1, 0, 5);
        TextField pPhone1 = new TextField();		editGrid.add(pPhone1, 1, 5);
        
        Label pgoalLab1 = new Label("Goals: "); editGrid.add(pgoalLab1, 0, 6);
        TextField pGoal1 = new TextField(); editGrid.add(pGoal1, 1, 6);
        
        Label teamName2lab = new Label("Team: "); editGrid.add(teamName2lab, 0, 7);
        TextField teamName2 = new TextField(); editGrid.add(teamName2, 1, 7);
        
        Label pgoalieLab1 = new Label("Goalie: "); editGrid.add(pgoalieLab1, 0, 8);
        CheckBox pGoalie1 = new CheckBox(); editGrid.add(pGoalie1, 1, 8);
        
        Label pEmailLab1 = new Label("Email: "); editGrid.add(pEmailLab1, 0, 9);
        TextField pEmail1 = new TextField(); editGrid.add(pEmail1, 1, 9);
        
        Button editPlayer = new Button("Edit Player"); editGrid.add(editPlayer, 1, 10);
        
        filterBySerach1.setOnAction(ActionEvent -> {
        	Player old = ConRef.getPlayerSearch(searchName1.getText());
        	pname1.setText(old.getName());
        	pPhone1.setText(old.getPhone());
        	pGoal1.setText(Integer.toString(old.getGoals()));
        	teamName2.setText(old.getTeam());
        	pEmail1.setText(old.getEmail());
        	ConRef.removePlayer(old.getName());
        });
        
        editPlayer.setOnAction(ActionEvent -> {
        	ConRef.newEditPlayer(pname1.getText(), pPhone1.getText(), Integer.parseInt(pGoal1.getText()), pGoalie1.isSelected(), pEmail1.getText(), teamName2.getText());
        	pname1.clear(); pPhone1.clear(); pGoal1.clear(); pEmail1.clear(); teamName2.clear();
        });
        
        
//        Player old = playerList.getSelectionModel().getSelectedItem();
//    	old.setTeam(teamList.getSelectionModel().getSelectedItem().getName());
//    	ConRef.removePlayer(playerList.getSelectionModel().getSelectedItem().getName() );
//    	ConRef.addPlayerTeam(old);
//    	playerList.setItems((ObservableList<Player>) FXCollections.observableArrayList(ConRef.getPlayersByName() ));
        
        VBox list = new VBox(editGrid);
        
        
        
        
		//-----------------------------
		//	Scene
		//-----------------------------
        
        TabPane tabPane = new TabPane();
        Tab addTab = new Tab("Add", add);
        Tab manageTab = new Tab("Manage", manage);
        Tab listTab = new Tab("Edit", list);
        
        manageTab.setOnSelectionChanged(e ->{
        	teamList.setItems((ObservableList<Team>) FXCollections.observableArrayList(ConRef.getTeamsbyName() ));
        	managerList.setItems((ObservableList<Manager>) FXCollections.observableArrayList(ConRef.getManagersbyName() ));
        	leagueList.setItems((ObservableList<League>) FXCollections.observableArrayList(ConRef.getLeaguesbyName()));
        	playerList.setItems((ObservableList<Player>) FXCollections.observableArrayList(ConRef.getPlayersByName() ));
        });
        
        tabPane.getTabs().add(addTab);
        tabPane.getTabs().add(manageTab);
        tabPane.getTabs().add(listTab);
        tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		
	    StackPane root = new StackPane();
	    root.getChildren().add(tabPane);
	    
	    Scene scene = new Scene(root, 850, 400);
	    primaryStage.setTitle("Football Manager");
	    primaryStage.setScene(scene);
	    primaryStage.show();
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
