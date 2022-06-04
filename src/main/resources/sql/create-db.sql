CREATE TABLE IF NOT EXISTS PROWADZACY (
id_prowadzacy INT NOT NULL,
tytul VARCHAR(15) NOT NULL,
imie VARCHAR(45) NOT NULL,
nazwisko VARCHAR(45) NOT NULL,
PRIMARY KEY (id_prowadzacy));



CREATE TABLE IF NOT EXISTS KURS (
id_kurs INT NOT NULL,
nazwa VARCHAR(100) NOT NULL,
skrot VARCHAR(10) NOT NULL,
rodzaj VARCHAR(20) NOT NULL,
PRIMARY KEY (id_kurs));



CREATE TABLE IF NOT EXISTS SEMESTR (
id_semestr INT NOT NULL,
rok_rozpoczecia INT NULL,
pora_roku VARCHAR(10) NULL,
PRIMARY KEY (id_semestr));




CREATE TABLE IF NOT EXISTS GRUPA (
id_grupa INT NOT NULL,
kod VARCHAR(12) NOT NULL,
dzien_tyg VARCHAR(15) NULL,
godz_rozpoczecia TIME NULL,
godz_zakonczenia TIME NULL,
tydzien VARCHAR(15) NULL,
id_prowadzacy INT NULL,
id_kurs INT NULL,
id_semestr INT NULL,
PRIMARY KEY (id_grupa),
UNIQUE (kod),
FOREIGN KEY (id_prowadzacy) REFERENCES PROWADZACY (id_prowadzacy),
FOREIGN KEY (id_kurs) REFERENCES KURS (id_kurs),
FOREIGN KEY (id_semestr) REFERENCES SEMESTR (id_semestr));



CREATE TABLE IF NOT EXISTS OCENA (
id_ocena INT NOT NULL,
ocena DECIMAL(1,0) NOT NULL,
timestamp_wystawienia TIMESTAMP NULL,
PRIMARY KEY (id_ocena));




CREATE TABLE IF NOT EXISTS STUDENT (
id_student INT NOT NULL,
imie VARCHAR(45) NOT NULL,
nazwisko VARCHAR(45) NOT NULL,
nr_dokumnetu VARCHAR(45) NULL,
obywatelstwo VARCHAR(45) NULL,
email VARCHAR(45) NULL,
hasz VARCHAR(45) NULL,
timestamp_blokady VARCHAR(45) NULL,
PRIMARY KEY (id_student));




CREATE TABLE IF NOT EXISTS ZAPIS (
id_zapis INT NOT NULL,
timestamp_zapisu TIMESTAMP NULL,
id_grupa INT NULL,
id_ocena INT NULL,
id_student INT NULL,
PRIMARY KEY (id_zapis),
FOREIGN KEY (id_grupa) REFERENCES GRUPA (id_grupa),
FOREIGN KEY (id_ocena) REFERENCES OCENA (id_ocena),
FOREIGN KEY (id_student) REFERENCES STUDENT (id_student));




CREATE TABLE IF NOT EXISTS KSIAZKA (
id_ksiazka INT NOT NULL,
isbn VARCHAR(13) NULL,
tytul VARCHAR(145) NOT NULL,
autor VARCHAR(45) NULL,
wydanie VARCHAR(45) NULL,
miejscowosc VARCHAR(45) NULL,
PRIMARY KEY (id_ksiazka),
UNIQUE (isbn));




CREATE TABLE IF NOT EXISTS EGZEMPLARZ_KSIAZKI (
numer_egzemplarza INT NOT NULL,
stan VARCHAR(45) NOT NULL,
id_ksiazka INT NULL,
PRIMARY KEY (numer_egzemplarza),
FOREIGN KEY (id_ksiazka) REFERENCES KSIAZKA (id_ksiazka));




CREATE TABLE IF NOT EXISTS WYPOZYCZENIE (
id_wypozyczenia INT NOT NULL,
timestamp_wypozyczenia TIMESTAMP NULL,
timetamp_zwrotu TIMESTAMP NULL,
id_student INT NULL,
numer_egzemplarza INT NULL,
PRIMARY KEY (id_wypozyczenia),
FOREIGN KEY (id_student) REFERENCES STUDENT (id_student),
FOREIGN KEY (numer_egzemplarza) REFERENCES EGEZMPLARZ_KSIAZKI (numer_egzemplarza));




CREATE TABLE IF NOT EXISTS ZOBOWIAZANIE (
id_zobowiazania INT NOT NULL,
kwota DECIMAL(8,2) NULL,
tytul VARCHAR(60) NULL,
timestamp_stworzenia TIMESTAMP NULL,
timestamp_oplacenia TIMESTAMP NULL,
id_student INT NULL,
PRIMARY KEY (id_zobowizania),
FOREIGN KEY (id_student) REFERENCES STUDENT (id_student));