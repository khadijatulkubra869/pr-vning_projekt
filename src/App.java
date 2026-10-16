/*
Bokningssystem Buss

Skapa array platser med 20 heltal.


Alla platser har värdet 0.

Skapa menyval = 0.

MEDANS menyval != 4:

	Skriv ut "1. Lägg till passagerare"
	Skriv ut "2. Visa lediga platser"
	Skriv ut "3. Beräkna vinst"
	Skriv ut "4. Avsluta"

	Läs in menyval.

	OM menyval == 1:
		FÖR i = 0 TILL 19:
			OM platser[i] == 0: (0 betyder ledig)
				Skriv ut "Ange födelsedatum:"
				Läs in födelsedatum.
				platser[i] = födelsedatum.
				Skriv ut "Bokningen är klar."
				Bryt loopen.
		OM ingen plats hittades:
			Skriv ut "Det finns inga lediga platser."

	ANNARS OM menyval == 2:
		Skapa lediga = 0.
		FÖR i = 0 TILL 19:
			OM platser[i] == 0:
				lediga = lediga + 1.
		Skriv ut "Lediga platser:", lediga.

	ANNARS OM menyval == 3:
		Skapa bokade = 0.
		FÖR i = 0 TILL 19:
			OM platser[i] != 0:
				bokade = bokade + 1.
		vinst = bokade * 299.90.
		Skriv ut "Vinst:", vinst, "kr".

	ANNARS OM menyval == 4:
		Skriv ut "Programmet avslutas."

	ANNARS:
		Skriv ut "Felaktigt menyval."

SLUT 

*/




void main()
{
    int[] platser = new int[20];
    int menyval = 0;

    while(menyval != 4)
    {
        IO.println("1. Lägg till passagerare");
        IO.println("2. Visa lediga platser");
        IO.println("3. Beräkna vinst");
        IO.println("4. Avsluta");

        menyval = Integer.parseInt(IO.readln());

        if(menyval == 1)
        {
            boolean hittad = false;

            for(int i = 0; i < 20; i++)
            {
                if(platser[i] == 0 && hittad == false)
                {
                    IO.println("Ange födelsedatum:");
                    int datum = Integer.parseInt(IO.readln());

                    platser[i] = datum;
                    hittad = true;

                    IO.println("Bokningen är klar!");
                    IO.println("Din plats är " + (i + 1));
                }
            }

            if(hittad == false)
            {
                IO.println("Bussen är full!");
            }
        }

        else if(menyval == 2)
        {
            int lediga = 0;

            for(int i = 0; i < 20; i++)
            {
                if(platser[i] == 0)
                {
                    lediga++;
                }
            }

            IO.println("Lediga platser: " + lediga);
        }

        else if(menyval == 3)
        {
            int bokade = 0;

            for(int i = 0; i < 20; i++)
            {
                if(platser[i] > 0)
                {
                    bokade++;
                }
            }

            double vinst = bokade * 299.90;

            IO.println("Antal sålda biljetter: " + bokade);
            IO.println("Vinsten är: " + vinst + " kr");
        }

        else if(menyval == 4)
        {
            IO.println("Programmet avslutas");
        }

        else
        {
            IO.println("Fel menyval");
        }
    }
}
