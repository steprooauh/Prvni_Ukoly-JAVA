# Java Úkoly – Základní dovednosti

## 🧠 O projektu

Tento repozitář obsahuje ukázky základních programátorských dovedností v jazyce **Java**, vytvořené v rámci výuky. Cílem je procvičení práce s cykly, seznamy (`ArrayList`), metodou `println`, třídou `Main` a dalšími základy objektově orientovaného programování.

## 👨‍💻 Autoři

- **Štěpán Prokop (stepa)**
- **Nika**

## 🛠️ Použité technologie

- Java 17+ (nebo kompatibilní verze)
- Konzolové vstupy a výstupy
- Základní knihovny: `java.util`, `java.util.ArrayList`, `java.util.Collections`, `java.util.Random`

## 📚 Co projekt obsahuje

Projekt je rozdělen do několika souborů a tříd:

### ✅ Funkce a ukázky:

#### 1. **Main.java**
- Hlavní třída s menu, které umožňuje volat jednotlivé části programu.
- Práce s objekty třídy `Pisen`.
- Výběr a spouštění úloh: cykly, práce s ArrayListy apod.

#### 2. **Pisen.java**
- Třída reprezentující hudební skladbu.
- Obsahuje atributy jako název, interpret, rok vydání, cena atd.
- Umožňuje výpis informací a úpravu data vydání.

#### 3. **Cykly.java**
- Ukázky práce s cykly `for`.
- Generování náhodných čísel.
- Rozlišení sudých a lichých čísel.

#### 4. **ArrayListUkol.java**
- Práce s čísly v ArrayListu.
- Výpočet průměru, maxima, minima.
- Počet jedniček a kolik známek bylo lepších než průměr.
- Seřazení a úpravy seznamu.

#### 5. **ArrayListoHodina.java**
- Práce s ArrayListem jmen a zvířat.
- Přidávání a odebírání položek.
- Výpis seznamu, zjišťování délky atd.

## 📸 Ukázky kódu

// Výpis známek a jejich průměru
ArrayList<Integer> cisla = new ArrayList<>(List.of(1, 2, 3, 4, 5));
int soucet = 0;
for (int c : cisla) {
    soucet += c;
}
System.out.println("Průměr: " + ((double) soucet / cisla.size()));

// Generování náhodných čísel a kontrola sudosti
Random rand = new Random();
for (int i = 0; i < 30; i++) {
    int cislo = rand.nextInt(50);
    System.out.println(cislo + (cislo % 2 == 0 ? " je sudé" : " je liché"));
}

###✅ Naučíš se

Pracovat s třídami a objekty v Javě.

Používat ArrayList, cykly, podmínky.

Číst a zapisovat data z/na konzoli.

Základy tříd, metod, proměnných a konstruktorů.

###🔚 Konec

Děkujeme za zhlédnutí projektu! 🙌
Slouží primárně pro výuku, procvičování a zábavu.
