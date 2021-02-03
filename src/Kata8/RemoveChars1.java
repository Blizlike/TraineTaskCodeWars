package Kata8;

public class RemoveChars1 {
	
	public static String remove(String str) {
		
		char[] temp = str.toCharArray(); //разбиваешь строку на массив символов. В нашем случае выглядит так: ['А','н','д','р'
										 // ,'е','й']
		
		temp[0] = ' ';                   //говоришь, что в первой ячейке теперь пробел(можно прям его написать): [' ','н','д',
										 // 'р','е','й']
		temp[temp.length - 1] = 0;       //говоришь, что в последней ячейке теперь пробел [' ','н','д','р','е',' ']
		String rsl = new String(temp);   //на основе массива символов создаешь новую строку "н д р е"
		return rsl.trim();               //функцией .trim() уничтожаешь пробелы в строке "ндре" и возвращаешь ее из метода
	}
}
/* Remove First and Last Character
 * It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string
 * You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
 */