package de.mvvt.migraenetagebuch.persistence;

import de.mvvt.migraenetagebuch.model.Entry;

/**
 * Created by Marcus on 01.09.13.
 */
public interface ICSVProvider {

    void saveEntry(Entry entry);
}
