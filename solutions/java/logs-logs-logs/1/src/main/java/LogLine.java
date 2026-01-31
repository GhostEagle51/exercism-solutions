public class LogLine {
     private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String code = logLine.substring(1, 4);
         switch (code) {
            case "TRC": return LogLevel.TRACE;
            case "DBG": return LogLevel.DEBUG;
            case "INF": return LogLevel.INFO;
            case "WRN": return LogLevel.WARNING;
            case "ERR": return LogLevel.ERROR;
            case "FTL": return LogLevel.FATAL;
            default:    return LogLevel.UNKNOWN;
        }
    }
    public String getOutputForShortLog() {
         LogLevel level = getLogLevel();
        String message = logLine.split(": ", 2)[1];
        return level.getEncoded() + ":" + message;
    }
}
