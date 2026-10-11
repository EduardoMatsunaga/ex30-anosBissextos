import javax.swing.JOptionPane;
public class ex30 {
	public static void main (String args []) {
		int anoA,mesA,diaA,anoN,mesN,diaN;
		int ano,mes,dia;
		int mesAnt,anoAnt;
		anoN = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
		mesN = Integer.parseInt(JOptionPane.showInputDialog("Digite seu mes de nascimento: "));
		diaN = Integer.parseInt(JOptionPane.showInputDialog("Digite seu dia de nascimento: "));
		anoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		mesA = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes atual: "));
		diaA = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual: "));
		
		ano = anoA-anoN;
		mes = mesA-mesN;
		dia = diaA-diaN;
		if (dia <0) {
			if(mesA == 1) {
				mesAnt = 12;
				anoAnt = anoA -1;
			}
			else {
				mesAnt = mesA - 1;
				anoAnt = anoA;
			}
			dia = dia + diaMes(mesAnt, anoAnt);
			mes -=1;
		}
		if (mes < 0) {
			mes +=12;
			ano -=1;
		}
		
		JOptionPane.showMessageDialog(null, "Idade: " + ano + " anos, " + mes + " meses e " + dia + " dias" );
	}
	
	static boolean bissexto (int ano) {
		if(( ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static int diaMes(int mes, int ano) {
		int dias [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (mes == 2 && bissexto (ano)) {
			return 29;
		}
		else {
			return dias[mes-1];
		}
	}
}
