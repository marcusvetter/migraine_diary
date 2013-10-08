package de.marcusvetter.migrainediary.persistence;

import de.marcusvetter.migrainediary.model.Entry;

/**
 * Created by Marcus on 01.09.13.
 */
public interface ICSVProvider {

    void saveEntry(Entry entry);
}
