public class ObjectFactory {
    public static Pen getInstance(String penName) {
        if (penName == null || penName.isEmpty()) {
            return null;
        }
        return switch (penName.toLowerCase()) {
            case "pilot" -> new PilotPen();
            case "gelpen" -> new GelPen();
            default -> throw new IllegalArgumentException("Unknown pen name" + penName);
        };
    }

}
