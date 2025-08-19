import java.util.*;

public class Game {
    List<PlayerIndia> playerIndiaList;
    List<PlayerSriLanka> playerSriLankaList;
    Game(List<PlayerIndia> playerIndiaList, List<PlayerSriLanka> playerSriLankalist) {
        this.playerIndiaList=playerIndiaList;
        this.playerSriLankaList=playerSriLankalist;
    }
    public int getTossResults(PlayerIndia capIndia,PlayerSriLanka capSriLanka) {
        int n=2;
        Random random=new Random();
        int res=random.nextInt(n);
        if(res==0) {
            System.out.println(capIndia+" India team won the toss : "+res);
        }
        else if(res==1) {
            System.out.println(capSriLanka+" SriLanka team won the toss : "+res);
        }
        return res;
    }
    public List<PlayerIndia> getOnStrikeIndiaPlayers(List<PlayerIndia> playerIndiaList) {
        List<PlayerIndia> batsman=new ArrayList<>();
        int count=1;
        for(int i=0;i<playerIndiaList.size() && count<=2;i++) {
            if(!playerIndiaList.get(i).out) {
                batsman.add(playerIndiaList.get(i));
                count+=1;
            }
        }
        return batsman;
    }

    public List<PlayerIndia> getOnStrikeSriLankaPlayers(List<PlayerSriLanka> playerSriLankaList) {
        List<PlayerIndia> batsman=new ArrayList<>();
        int count=1;
        for(int i=0;i<playerSriLankaList.size() && count<=2;i++) {
            if(!playerSriLankaList.get(i).out) {
                batsman.add(playerIndiaList.get(i));
                count+=1;
            }
        }
        return batsman;
    }

    public PlayerIndia getIndiaBowler(List<PlayerIndia> playerIndiaList) {
        int n=11;
        Random random=new Random();
        HashMap<Integer, Boolean> visited=new HashMap<Integer, Boolean>();
        while(true) {
            int index=random.nextInt(n);
            if(!visited.get(playerIndiaList.get(index).getJerseyNo()) &&  playerIndiaList.get(index).type==1) {
                return playerIndiaList.get(index);
            }
            visited.put(playerIndiaList.get(index).getJerseyNo(),true);
        }
    }
    public PlayerIndia getSriLankaBowler(List<PlayerSriLanka> playerIndiaList) {
        int n=11;
        Random random=new Random();
        HashMap<Integer, Boolean> visited=new HashMap<Integer, Boolean>();
        while(true) {
            int index=random.nextInt(n);
            if(!visited.get(playerIndiaList.get(index).getJerseyNo()) &&  playerIndiaList.get(index).type==1) {
                return playerIndiaList.get(index);
            }
            visited.put(playerIndiaList.get(index).getJerseyNo(),true);
        }
    }
    public int getBallResult(int run) {
        if(run==1 || run==2 || run==3 || run==4 || run==6) {
            return run;
        }
        else if(run==0) {
            return 0;
        }
        return -1;
    }
    public void cricket() {
        List<PlayerIndia> indiaBatsmanList=getOnStrikeIndiaPlayers(playerIndiaList); //batting
        List<PlayerSriLanka> sriLankasBowlerList=getSriLankaBowler(playerSriLankaList);
        int indiaCount=11;
        boolean playerOneStrike=true;
        for(int i=0;i<6;i++) {
            while(true) {
                if (playerOneStrike && !indiaBatsmanList.get(0).getOut()) {
                    int maxStrike = 7;
                    Random random = new Random();
                    int run = random.nextInt(maxStrike);
                    int result=getBallResult(run);
                    if(result==1 || i==5 || result==3) {
                        playerOneStrike = !playerOneStrike;
                    }
                    if(result>0) {
                        indiaBatsmanList.get(0).score = result;
                        sriLankasBowlerList.get(0).score=result;
                        break;
                    }
                    else if(result==0) {
                        indiaBatsmanList.get(0).out=true;
                        break;
                    }
                }
                else if(!playerOneStrike && !indiaBatsmanList.get(1).getOut()) {

                    playerOneStrike=!playerOneStrike;
                }
            }
        }
    }
    public void scoreBoard() {

    }
}
