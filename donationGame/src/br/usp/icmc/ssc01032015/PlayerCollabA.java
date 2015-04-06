package br.usp.icmc.ssc01032015;

public class PlayerCollabA extends Player{

	private Competitor master = null;

	@Override
	public void informDonationFrom(Competitor c, double donation) {
		if (donation ==	0.000000000000000000893675669267420d && master == null)
			master = c;
	}

	@Override
	public double declareDonationTo(Competitor c) {
		if(c.equals(master))
			return 10;
		else
			return 0;
	}

	@Override
	public String toString(){
		return "Adenilsoum";
	}

}
