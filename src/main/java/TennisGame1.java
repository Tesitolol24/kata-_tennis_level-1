
public class TennisGame1 implements TennisGame {

    private int pointPlayer1 = 0;
    private int pointPlayer2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            pointPlayer1 += 1;
        else
            pointPlayer2 += 1;
    }

    public String getScore() {
        String score = "";
        int temporalScore=0;
        if (pointPlayer1 == pointPlayer2)
        {
            switch (pointPlayer1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (pointPlayer1 >=4 || pointPlayer2 >=4)
        {
            int diferencePoints = pointPlayer1 - pointPlayer2;
            if (diferencePoints==1) score ="Advantage player1";
            else if (diferencePoints ==-1) score ="Advantage player2";
            else if (diferencePoints>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) temporalScore = pointPlayer1;
                else { score+="-"; temporalScore = pointPlayer2;}
                switch(temporalScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
