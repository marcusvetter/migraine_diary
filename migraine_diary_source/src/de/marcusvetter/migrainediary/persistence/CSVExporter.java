package de.marcusvetter.migrainediary.persistence;

import android.os.Environment;
import de.marcusvetter.migrainediary.model.Entry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Marcus
 * Date: 08.10.13
 * Time: 14:49
 * To change this template use File | Settings | File Templates.
 */
public class CSVExporter implements ICSVProvider {

    private static final String SEPARATOR_CHAR = "; ";

    @Override
    public boolean saveEntry(Entry entry) {

        StringBuilder result = new StringBuilder();

        result.append(entry.getDate() + SEPARATOR_CHAR);
        result.append(entry.getGetUp() + SEPARATOR_CHAR);
        result.append(entry.getBedtime() + SEPARATOR_CHAR);
        result.append(entry.getActivity() + SEPARATOR_CHAR);
        result.append(entry.getStressLevel() + SEPARATOR_CHAR);
        result.append(entry.getHeadpain() + SEPARATOR_CHAR);
        result.append(entry.isPainkiller() + SEPARATOR_CHAR);
        result.append(entry.isSurplusCarb() + SEPARATOR_CHAR);
        result.append(entry.isSurplusFat() + SEPARATOR_CHAR);
        result.append(entry.isSurplusProtein() + SEPARATOR_CHAR);
        result.append(entry.isLackWater() + SEPARATOR_CHAR);
        result.append(entry.isLackMeat() + SEPARATOR_CHAR);
        result.append(entry.isDrinksCoffee() + SEPARATOR_CHAR);
        result.append(entry.isDrinksAlc() + SEPARATOR_CHAR);
        result.append(entry.getWeather() + SEPARATOR_CHAR);
        result.append(entry.getTemp() + SEPARATOR_CHAR);
        result.append(entry.isSportsEndurance() + SEPARATOR_CHAR);
        result.append(entry.isSportsPower() + SEPARATOR_CHAR);

        String lineToAdd = result.toString();

        String downloadDir = Environment.getExternalStorageDirectory().toString() + "/Download";
        File migraineDiaryFolder = new File(downloadDir + "/migraine_diary.csv");

        try {
            if (!migraineDiaryFolder.exists())
                migraineDiaryFolder.createNewFile();

            FileWriter fw = new FileWriter(migraineDiaryFolder, true);
            fw.write(lineToAdd);
            fw.write(System.getProperty("line.separator"));

            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;

    }
}
