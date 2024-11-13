package dev.octoshrimpy.quik.feature.gallery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\'H\u0014J\u0010\u0010/\u001a\u00020+2\u0006\u00100\u001a\u000201H\u0016J\u000e\u00102\u001a\u00020\'2\u0006\u00103\u001a\u00020\fJ\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\f05H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e05H\u0016J\u0010\u00107\u001a\u00020\'2\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\'H\u0016J\f\u0010;\u001a\u0006\u0012\u0002\b\u000305H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006<"}, d2 = {"Ldev/octoshrimpy/quik/feature/gallery/GalleryActivity;", "Ldev/octoshrimpy/quik/common/base/QkActivity;", "Ldev/octoshrimpy/quik/feature/gallery/GalleryView;", "()V", "dateFormatter", "Ldev/octoshrimpy/quik/common/util/DateFormatter;", "getDateFormatter", "()Ldev/octoshrimpy/quik/common/util/DateFormatter;", "setDateFormatter", "(Ldev/octoshrimpy/quik/common/util/DateFormatter;)V", "optionsItemSubject", "Lio/reactivex/subjects/Subject;", "", "pageChangedSubject", "Ldev/octoshrimpy/quik/model/MmsPart;", "pagerAdapter", "Ldev/octoshrimpy/quik/feature/gallery/GalleryPagerAdapter;", "getPagerAdapter", "()Ldev/octoshrimpy/quik/feature/gallery/GalleryPagerAdapter;", "setPagerAdapter", "(Ldev/octoshrimpy/quik/feature/gallery/GalleryPagerAdapter;)V", "partId", "", "getPartId", "()J", "partId$delegate", "Lkotlin/Lazy;", "viewModel", "Ldev/octoshrimpy/quik/feature/gallery/GalleryViewModel;", "getViewModel", "()Ldev/octoshrimpy/quik/feature/gallery/GalleryViewModel;", "viewModel$delegate", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPageSelected", "position", "optionsItemSelected", "Lio/reactivex/Observable;", "pageChanged", "render", "state", "Ldev/octoshrimpy/quik/feature/gallery/GalleryState;", "requestStoragePermission", "screenTouched", "presentation_noAnalyticsRelease"})
public final class GalleryActivity extends dev.octoshrimpy.quik.common.base.QkActivity implements dev.octoshrimpy.quik.feature.gallery.GalleryView {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.DateFormatter dateFormatter;
    @javax.inject.Inject
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.feature.gallery.GalleryPagerAdapter pagerAdapter;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy partId$delegate = null;
    private final io.reactivex.subjects.Subject<java.lang.Integer> optionsItemSubject = null;
    private final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.model.MmsPart> pageChangedSubject = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public GalleryActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.DateFormatter getDateFormatter() {
        return null;
    }
    
    public final void setDateFormatter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.DateFormatter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.gallery.GalleryPagerAdapter getPagerAdapter() {
        return null;
    }
    
    public final void setPagerAdapter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.gallery.GalleryPagerAdapter p0) {
    }
    
    public final long getPartId() {
        return 0L;
    }
    
    private final dev.octoshrimpy.quik.feature.gallery.GalleryViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onPageSelected(int position) {
    }
    
    @java.lang.Override
    public void render(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.gallery.GalleryState state) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<java.lang.Integer> optionsItemSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<?> screenTouched() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Observable<dev.octoshrimpy.quik.model.MmsPart> pageChanged() {
        return null;
    }
    
    @java.lang.Override
    public void requestStoragePermission() {
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}