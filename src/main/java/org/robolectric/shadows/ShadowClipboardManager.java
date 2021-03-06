package org.robolectric.shadows;

import android.content.ClipboardManager;
import org.robolectric.internal.Implementation;
import org.robolectric.internal.Implements;

@Implements(ClipboardManager.class)
public class ShadowClipboardManager {
    private CharSequence text;

    @Implementation
    public void setText(CharSequence text) {
        this.text = text;
    }

    @Implementation
    public CharSequence getText() {
        return text;
    }

    @Implementation
    public boolean hasText() {
        return text != null && text.length() > 0;
    }
}
