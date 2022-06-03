INSERT INTO PROWADZACY (id_prowadzacy,tytul,imie,nazwisko) VALUES
(1, 'dr inż.', 'Krystian', 'Popiołek'),
(2, 'mgr inż.', 'Karim', 'Benzema'),
(3, 'dr inż.', 'Mateusz', 'Świeczak'),
(4, 'prof. dr hab.', 'Agnieszka', 'Kucharska'),
(5, 'prof. nadzw.', 'Tymoteusz', 'Ciemny');

INSERT INTO KURS (id_kurs,nazwa,skrot,rodzaj) VALUES
(1, 'Modelowanie Układów Dynamicznych', 'MUD', 'laboratorium'),
(2, 'Modelowanie Układów Dynamicznych', 'MUD', 'ćwiczenia'),
(3, 'Modelowanie Układów Dynamicznych', 'MUD', 'wykład'),
(4, 'Projektowanie Aplikacji Internetowych', 'PAI', 'laboratorium'),
(5, 'Projektowanie Aplikacji Internetowych', 'PAI', 'wykład');

INSERT INTO SEMESTR (id_semestr,rok_rozpoczecia,pora_roku) VALUES
(1, 2020, 'zimowy'),
(2, 2021, 'letni'),
(3, 2021, 'zimowy'),
(4, 2022, 'letni'),
(5, 2022, 'zimowy');

INSERT INTO GRUPA (id_grupa,kod,dzien_tyg,godz_rozpoczecia,godz_zakonczenia,tydzien,id_prowadzacy,id_kurs,id_semestr) VALUES
(1, 'A1B15', 'poniedziałek', '12:30:00', '15:30:00', 'parzysty', 3, 1, 4),
(2, 'A1B16', 'poniedziałek', '15:45:00', '18:45:00', 'parzysty', 3, 1, 4),
(3, 'B1B10', 'środa', '10:00:00', '11:30:00', 'nieparzysty', 2, 4, 5),
(4, 'B1B11', 'środa', '11:45:00', '13:15:00', 'nieparzysty', 1, 4, 5),
(5, 'B1B12', 'czwartek', '11:45:00', '13:15:00', 'parzysty', 5, 5, 5);

INSERT INTO OCENA (id_ocena,ocena,timestamp_wystawienia) VALUES
(1, 2.0, '2021-06-13 12:30:41'),
(2, 3.0, '2021-06-13 12:32:39'),
(3, 4.5, '2021-06-14 13:30:09'),
(4, 5.0, '2021-06-15 11:20:49'),
(5, 5.5, '2021-06-15 17:00:01');

INSERT INTO STUDENT (id_student,imie,nazwisko,nr_dokumnetu,obywatelstwo,email,hasz,timestamp_blokady) VALUES
(1, 'Krzysztof', 'Trypka', '22100', 'polskie', 'krzysztof.trypka@fakeuni.pl','aaa','2021-06-13 12:30:41'),
(2, 'Alicja', 'Żyła', '22101', 'polskie', 'alicja.zyla@fakeuni.pl','aab','2021-06-13 12:31:41'),
(3, 'Wołodymir', 'Kysorets', '22102', 'ukraińskie', 'wolodymir.kysorets@fakeuni.pl','abb','2021-06-13 12:32:41'),
(4, 'Krzysztof', 'Piątek', '22103', 'polskie', 'krzysztof.piatek@fakeuni.pl','bbb','2021-06-13 12:33:41'),
(5, 'John', 'Lennon', '22104', 'amerykańskie', 'john.lennon@fakeuni.pl','bbc','2021-06-13 12:34:41');

INSERT INTO ZAPIS (id_zapis, timestamp_zapisu, id_grupa, id_ocena, id_student) VALUES
(1, '2022-01-01 10:01:10', 3, 1, 1),
(2, '2022-01-01 10:02:10', 3, 2, 2),
(3, '2022-01-01 10:03:10', 3, 3, 3),
(4, '2022-01-01 10:04:10', 3, 4, 4),
(5, '2022-01-01 10:05:10', 3, 5, 5);

INSERT INTO KSIAZKA (id_ksiazka,isbn,tytul,autor,wydanie,miejscowosc) VALUES
(1, '1234567890111', 'HTML dla opornych', 'Jacek Zieliński', 'Xx2021', 'Wrocław'),
(2, '1224567890111', 'CSS dla opornych', 'Robert Zieliński', 'Xx2016', 'Wrocław'),
(3, '1244567890111', 'JS dla opornych', 'Jacek Kowal', 'Xx2013', 'Wrocław'),
(4, '1254567890111', 'Biblia JAVA', 'Jarosław Duda', 'Xx2021', 'Wrocław'),
(5, '1264567890111', 'Data Engineering PYTHON', 'Marcin Zieliński', 'Xx2011', 'Wrocław');

INSERT INTO EGZEMPLARZ_KSIAZKI (numer_egzemplarza,stan,id_ksiazka) VALUES
(1,3,1),
(2,3,1),
(3,3,1),
(4,2,2),
(5,2,2);

INSERT INTO WYPOZYCZENIE (id_wypozyczenia,timestamp_wypozyczenia,timetamp_zwrotu,id_student,numer_egzemplarza) VALUES
(1, '2022-01-01 10:01:10', '2022-01-03 10:01:10', 1, 2),
(2, '2022-01-02 10:02:10', '2022-01-04 10:02:10', 2, 3),
(3, '2022-01-03 10:03:10', '2022-01-05 10:03:10', 3, 1),
(4, '2022-01-04 10:04:10', '2022-01-06 10:04:10', 4, 4),
(5, '2022-01-05 10:05:10', '2022-01-07 10:05:10', 4, 5);

INSERT INTO ZOBOWIAZANIE (id_zobowiazania,kwota,tytul,timestamp_stworzenia,timestamp_oplacenia,id_student) VALUES
(1, 12.50, 'Legitymacja', '2022-01-01 10:01:10', '2022-01-01 11:01:10', 1),
(2, 420.00, 'Kurs poprawkowy MUD', '2022-01-01 10:01:10', '2022-01-01 12:01:10', 2),
(3, 420.00, 'Kurs poprawkowy MUD', '2022-01-01 10:01:11', '2022-01-01 12:01:14', 3),
(4, 420.00, 'Kurs poprawkowy MUD', '2022-01-01 10:01:12', '2022-01-02 12:01:15', 4),
(5, 420.00, 'Kurs poprawkowy MUD', '2022-01-01 10:01:13', '2022-01-03 12:01:59', 5);
