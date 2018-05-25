package net.bible.service.device.speak;


import net.bible.android.control.speak.SpeakSettings;
import org.crosswire.jsword.book.Book;
import org.crosswire.jsword.passage.Key;

import java.util.HashMap;
import java.util.List;

public abstract class AbstractSpeakTextProvider {
    //abstract void setupReading(Book book, List<Key> keyList, SpeakSettings settings);
    abstract boolean isMoreTextToSpeak();
    abstract String getNextTextToSpeak();
    abstract void pause(float fractionCompleted);
    abstract void rewind();
    abstract void forward();
    abstract void finishedUtterance(String utteranceId);
    abstract void reset();
    abstract void persistState();
    abstract boolean restoreState();
    abstract void clearPersistedState();
    abstract long getTotalChars();
    abstract long getSpokenChars();
}
