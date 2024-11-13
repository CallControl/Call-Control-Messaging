package dev.octoshrimpy.quik.common.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001eB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0014J\b\u0010\u001d\u001a\u00020\u0014H\u0002R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Ldev/octoshrimpy/quik/common/widget/BubbleImageView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "Ldev/octoshrimpy/quik/common/widget/BubbleImageView$Style;", "bubbleStyle", "getBubbleStyle", "()Ldev/octoshrimpy/quik/common/widget/BubbleImageView$Style;", "setBubbleStyle", "(Ldev/octoshrimpy/quik/common/widget/BubbleImageView$Style;)V", "path", "Landroid/graphics/Path;", "radiusLarge", "", "radiusSmall", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "", "h", "oldw", "oldh", "setPath", "Style", "presentation_noAnalyticsRelease"})
public final class BubbleImageView extends android.widget.ImageView {
    @org.jetbrains.annotations.NotNull
    private dev.octoshrimpy.quik.common.widget.BubbleImageView.Style bubbleStyle = dev.octoshrimpy.quik.common.widget.BubbleImageView.Style.ONLY;
    private final android.graphics.Path path = null;
    private final float radiusSmall = 0.0F;
    private final float radiusLarge = 0.0F;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads
    public BubbleImageView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public BubbleImageView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.widget.BubbleImageView.Style getBubbleStyle() {
        return null;
    }
    
    public final void setBubbleStyle(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.widget.BubbleImageView.Style value) {
    }
    
    @java.lang.Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    private final void setPath() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013\u00a8\u0006\u0014"}, d2 = {"Ldev/octoshrimpy/quik/common/widget/BubbleImageView$Style;", "", "topLeft", "", "topRight", "bottomRight", "bottomLeft", "(Ljava/lang/String;IZZZZ)V", "getBottomLeft", "()Z", "getBottomRight", "getTopLeft", "getTopRight", "ONLY", "IN_FIRST", "IN_MIDDLE", "IN_LAST", "OUT_FIRST", "OUT_MIDDLE", "OUT_LAST", "presentation_noAnalyticsRelease"})
    public static enum Style {
        /*public static final*/ ONLY /* = new ONLY(false, false, false, false) */,
        /*public static final*/ IN_FIRST /* = new IN_FIRST(false, false, false, false) */,
        /*public static final*/ IN_MIDDLE /* = new IN_MIDDLE(false, false, false, false) */,
        /*public static final*/ IN_LAST /* = new IN_LAST(false, false, false, false) */,
        /*public static final*/ OUT_FIRST /* = new OUT_FIRST(false, false, false, false) */,
        /*public static final*/ OUT_MIDDLE /* = new OUT_MIDDLE(false, false, false, false) */,
        /*public static final*/ OUT_LAST /* = new OUT_LAST(false, false, false, false) */;
        private final boolean topLeft = false;
        private final boolean topRight = false;
        private final boolean bottomRight = false;
        private final boolean bottomLeft = false;
        
        Style(boolean topLeft, boolean topRight, boolean bottomRight, boolean bottomLeft) {
        }
        
        public final boolean getTopLeft() {
            return false;
        }
        
        public final boolean getTopRight() {
            return false;
        }
        
        public final boolean getBottomRight() {
            return false;
        }
        
        public final boolean getBottomLeft() {
            return false;
        }
    }
}