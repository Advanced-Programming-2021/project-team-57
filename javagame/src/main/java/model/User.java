package model;
import controller.DataBase;
 public class User
{
    public String username;
    public String nickname;
    public String password;
    private String scores;		
   /* private List<UserName> allUsernames;
    private List<Password> allPasswords;		
    private List<Nickname> allNicknames;		
    private List<Score> allScores;		
    private List<MainDecks> allMainDecks;		
    private List<SideDecks> allSideDecks;		
    private Deck;*/

public User(){

    setUsername(username);
    setPassword(password);
    setNickname(nickname);
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
}
