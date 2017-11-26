
public class PlayingCards{
	enum Rank{ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king}
public static void main(String[] args) {
Rank faceCard, card1, card2;
faceCard=Rank.jack;
card1= Rank.two;
card2=Rank.three;
System.out.println("A one card hand:" + faceCard);
System.out.println("A two card hand:" + card1.name() + " and " + card2.name());

int card1val= card1.ordinal() +1;
int card2val= card2.ordinal() +1;
System.out.println(" hand value:" + (card1val + card2val));
}
}