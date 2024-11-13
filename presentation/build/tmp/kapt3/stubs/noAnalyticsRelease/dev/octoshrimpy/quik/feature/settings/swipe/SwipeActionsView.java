package dev.octoshrimpy.quik.feature.settings.swipe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bJ\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H&\u00a8\u0006\f"}, d2 = {"Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsView;", "Ldev/octoshrimpy/quik/common/base/QkViewContract;", "Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsState;", "actionClicks", "Lio/reactivex/Observable;", "Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsView$Action;", "actionSelected", "", "showSwipeActions", "", "selected", "Action", "presentation_noAnalyticsRelease"})
public abstract interface SwipeActionsView extends dev.octoshrimpy.quik.common.base.QkViewContract<dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<dev.octoshrimpy.quik.feature.settings.swipe.SwipeActionsView.Action> actionClicks();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> actionSelected();
    
    public abstract void showSwipeActions(int selected);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Ldev/octoshrimpy/quik/feature/settings/swipe/SwipeActionsView$Action;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "presentation_noAnalyticsRelease"})
    public static enum Action {
        /*public static final*/ LEFT /* = new LEFT() */,
        /*public static final*/ RIGHT /* = new RIGHT() */;
        
        Action() {
        }
    }
}