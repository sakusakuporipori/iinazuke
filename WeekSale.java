package 俺の許嫁と幼馴染が修羅場すぎる;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekSale {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String line = br.readLine();     //7の倍数を入力
		int multiple_7 = Integer.parseInt(line);     //int化

		int[] salesArray = new int[multiple_7];     //毎日の売り上げを格納する配列

		for(int i = 0; i < multiple_7; i++) {
			String line2 = br.readLine();
			salesArray[i] = Integer.parseInt(line2);
		}

		int[] Days_of_the_week_salesArray = new int[7];     //曜日ごとの売り上げの合計を格納する配列

		for(int j = 0; j < salesArray.length; j++) {
			if(j%7 == 0) {     //余りが0(月曜日)の場合
				Days_of_the_week_salesArray[0] = Days_of_the_week_salesArray[0] + salesArray[j];     //0番目に加える
			}
			else if(j%7 == 1) {     //余りが1(火曜日)の場合
				Days_of_the_week_salesArray[1] = Days_of_the_week_salesArray[1] + salesArray[j];     //1番目に加える
			}
			else if(j%7 == 2) {     //余りが2(水曜日)の場合
				Days_of_the_week_salesArray[2] = Days_of_the_week_salesArray[2] + salesArray[j];     //2番目に加える
			}
			else if(j%7 == 3) {     //余りが3(木曜日)の場合
				Days_of_the_week_salesArray[3] = Days_of_the_week_salesArray[3] + salesArray[j];     //3番目に加える
			}
			else if(j%7 == 4) {     //余りが4(金曜日)の場合
				Days_of_the_week_salesArray[4] = Days_of_the_week_salesArray[4] + salesArray[j];     //4番目に加える
			}
			else if(j%7 == 5) {     //余りが5(土曜日)の場合
				Days_of_the_week_salesArray[5] = Days_of_the_week_salesArray[5] + salesArray[j];     //5番目に加える
			}
			else if(j%7 == 6) {     //余りが6(日曜日)の場合
				Days_of_the_week_salesArray[6] = Days_of_the_week_salesArray[6] + salesArray[j];     //6番目に加える
			}
		}

		for(int a = 0; a < Days_of_the_week_salesArray.length; a++) {
			System.out.println(Days_of_the_week_salesArray[a]);
		}
	}
}
