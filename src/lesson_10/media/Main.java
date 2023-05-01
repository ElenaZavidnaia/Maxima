package lesson_10.media;

import static sun.nio.cs.Surrogate.MIN;

public class Main {
    public static void main(String[] args) {
        /**
         * * Вы работаете над программой-каталогом домашней медиа-библиотеки фильмов и музыкальных альбомов на DVD дисках (образах).
         * * 1. Разобрать классы для хранения информации о:
         * - музыкальных альбомах (название альбома, исполнитель, год издания, количество треков)
         * - фильмах (название, год выхода, студия издатель, режиссер, продолжительность в минутах)
         * * 2. Создать массив дисков с неоднородным составом (фильмы и музыкальные диски),
         * заполнить его несколькими элементами, вывести все элементы на экран.
         * * 3. Найти в массиве самый старый диск и вывести информацию о нем на экран.**/
        AudioDisk audioDisk1 = new AudioDisk();
        AudioDisk audioDisk2 = new AudioDisk();
        AudioDisk audioDisk3 = new AudioDisk();
        VideoDisk videoDisk1 = new VideoDisk();
        VideoDisk videoDisk2 = new VideoDisk();

        audioDisk1.setName("White");
        audioDisk1.setYear(1991);
        audioDisk1.setSinger("Кино");
        audioDisk1.setCountOfTracks(12);

        audioDisk3.setSinger("Sektor gaza");
        audioDisk3.setName("Sektor gaza");
        audioDisk3.setYear(1900);
        audioDisk3.setCountOfTracks(14);

        audioDisk2.setSinger("Sektor gaza2");
        audioDisk2.setName("Sektor gaza2");
        audioDisk2.setYear(1902);
        audioDisk2.setCountOfTracks(16);

        videoDisk1.setName("Transformery");
        videoDisk1.setCountOfMinutes(120);
        videoDisk1.setDirector("Michael Bay");
        videoDisk1.setYear(2017);
        videoDisk1.setProducer("Rodnyanskiy");

        videoDisk2.setName("Transformery2");
        videoDisk2.setCountOfMinutes(122);
        videoDisk2.setDirector("Michael Bay2");
        videoDisk2.setYear(2019);
        videoDisk2.setProducer("Rodnyanskiy2");

        //2. Создать массив дисков с неоднородным составом (фильмы и музыкальные диски),
        //   заполнить его несколькими элементами, вывести все элементы на экран.

        Disk[] boxOfDisks = new Disk[5];
        boxOfDisks[0]=audioDisk1;
        boxOfDisks[1]=audioDisk2;
        boxOfDisks[2]=audioDisk3;
        boxOfDisks[3]=videoDisk1;
        boxOfDisks[4]=videoDisk2;

        for (Disk diskFromBox: boxOfDisks) {
            System.out.println(diskFromBox.toString());
        }

        //3. Найти в массиве самый старый диск и вывести информацию о нем на экран.
        System.out.println();
        System.out.println("Самый старый диск :");

        int date = Integer.MAX_VALUE;
        int dateTek = 0;
        Disk oldDisk = new Disk();
        for (Disk diskFromBox: boxOfDisks) {
            if ((dateTek = diskFromBox.getYear()) < date){
                date = dateTek;
                oldDisk = diskFromBox;
            }
        }
        System.out.println(oldDisk.toString());
    }
}
