package model;
public class User
{
    public String username;
    public String nickname;
    public String password;
    private String scores;
    public String userMenuPosition;
   /* private List<UserName> allUsernames;
    private List<Password> allPasswords;		
    private List<Nickname> allNicknames;		
    private List<Score> allScores;		
    private List<MainDecks> allMainDecks;		
    private List<SideDecks> allSideDecks;		
    private Deck;*/

    public User(String username, String nickname, String password, String scores, String userMenuPosition) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.scores = scores;
        this.userMenuPosition = userMenuPosition;
    }

    public User() {

    }


    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public void setUserMenuPosition(String userMenuPosition){
        this.userMenuPosition = userMenuPosition;
    }

}
