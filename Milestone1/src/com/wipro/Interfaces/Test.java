package live;

import music.Playable;
import music.string.Veena;
import music.wind.SaxoPhone;
public class Test {
	public static void main(String args[])
	{
		Veena v=new Veena();
		v.play();
		Playable pv=new Veena();
		pv.play();
		SaxoPhone s=new SaxoPhone();
		s.play();
		Playable ps=new SaxoPhone();
		ps.play();
	}
}
