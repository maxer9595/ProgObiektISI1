package pl.edu.uwm.wmii.marcelmrozowski.laboratorium06.pl.imiajd.mrozowski;

public class NazwanyPunkt extends Punkt{
        public NazwanyPunkt(int x, int y, String name)
        {
            super(x, y);
            this.name = name;
        }

        @Override
        public void show()
        {
            System.out.println(name + ":<" + x() + ", " + y() + ">");
        }

        private String name;
}
