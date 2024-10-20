package enums;

import java.awt.*;

/**
 * @Dự án: tau-viet-express
 * @Enum: EColor
 * @Tạo vào ngày: 30/9/2024
 * @Tác giả: Huy
 */
public enum EColor {
    TITLE_BAR_COLOR(153, 224, 244),

    // GHE
    GHE_TRONG(255, 255, 255), // Trắng
    GHE_DANG_CHON(115, 251, 253),
    GHE_DA_BAN(235, 51, 36),

    BG_COLOR(255, 255, 255),
    BG_COLOR_2(115, 251, 253),
    BG_COLOR_3(128, 128, 128),
    TITLE_COLOR(0, 162, 232),
    TEXT_COLOR(0, 0, 0),
    BTN_BG_COLOR(1, 135, 198),
    BTN_TEXT_COLOR(255, 255, 255),
    BTN_ACTIVE_BG_COLOR(167, 146, 119),
    PROD_BG_COLOR(255,242,216),
    BORDER_COLOR(189, 189, 189),
    SEC_BG_COLOR(234, 198, 150),
    MENU_BG_COLOR(255, 255, 255),
    TAB_BG_COLOR(234, 234, 234),

    HOVER_BTN_COLOR(192, 192, 192),
    DISABLED_COLOR(189, 189, 189);

    private int r;
    private int g;
    private int b;

    EColor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public Color getColor() {
        return new Color(r, g, b);
    }

    public Color getDecodeColor() {
        return Color.decode("#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b));
    }
}
