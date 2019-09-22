package jp.coocan.la.webview003;

import android.util.Log;

public class WidgetLog {
    static private final boolean DBG = false;

    /**
     * Log.vの表示を行う
     * @param tag タグ
     * @param log ログ内容
     */
    static public void v(String tag, String log) {
        if (DBG) Log.v(tag, log);
    }

    /**
     * Log.dの表示を行う
     * @param tag タグ
     * @param log ログ内容
     */
    static public void d(String tag, String log) {
        if (DBG) Log.d(tag, log);
    }

    /**
     * Log.iの表示を行う
     * @param tag タグ
     * @param log ログ内容
     */
    static public void i(String tag, String log) {
    	if (DBG) Log.i(tag, log);
    }

    /**
     * Log.eの表示を行う
     * @param tag タグ
     * @param log ログ内容
     */
    static public void e(String tag, String log) {
    	if (DBG) Log.e(tag, log);
    }

    /**
     * Log.wの表示を行う
     * @param tag タグ
     * @param log ログ内容
     */
    static public void w(String tag, String log) {
    	if (DBG) Log.w(tag, log);
    }
}
