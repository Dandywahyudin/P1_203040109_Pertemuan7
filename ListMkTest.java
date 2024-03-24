package Tugas7;

public class ListMkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strukturlist list = new Strukturlist();
		list.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
		list.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
		list.displayElement();
		
		//Tes-1
		Strukturlist listTes1 = new Strukturlist();
		listTes1.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
		listTes1.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
		listTes1.addHead(new Matakuliah("IF003", "Struktur Diskrit", 3));
		listTes1.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
		listTes1.displayElement();
		
		//Tes-4
		Strukturlist listTes4 = new Strukturlist();
		listTes4.addTail(new Matakuliah("IF001", "Dasar Pemrograman", 4));
		listTes4.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
		listTes4.addMid(new Matakuliah("IF003", "Struktur Diskrit", 3), 1);
		listTes4.addMid(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3), 1);
		listTes4.displayElement();
	}

}
