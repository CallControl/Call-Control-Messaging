package dev.octoshrimpy.quik.feature.compose.editing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0014J\u0018\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0014J\"\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\'\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010(\u001a\u00020)H\u0002J\"\u0010*\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0002J\"\u0010+\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010,\u001a\u00020-2\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0002J\"\u0010.\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010/\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u00100\u001a\u00020!2\u0006\u00101\u001a\u000202H\u0016J\u0018\u00103\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0016J\u0018\u00106\u001a\u00020#2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u000205H\u0016J\u0010\u0010:\u001a\u00020!2\u0006\u00101\u001a\u000202H\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R<\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006;"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItemAdapter;", "Ldev/octoshrimpy/quik/common/base/QkAdapter;", "Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem;", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "(Ldev/octoshrimpy/quik/common/util/Colors;Ldev/octoshrimpy/quik/repository/ConversationRepository;)V", "clicks", "Lio/reactivex/subjects/Subject;", "getClicks", "()Lio/reactivex/subjects/Subject;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "longClicks", "getLongClicks", "numbersViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "value", "", "", "Ldev/octoshrimpy/quik/model/Recipient;", "recipients", "getRecipients", "()Ljava/util/Map;", "setRecipients", "(Ljava/util/Map;)V", "areContentsTheSame", "", "old", "new", "areItemsTheSame", "bindGroup", "", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "group", "Ldev/octoshrimpy/quik/model/ContactGroup;", "prev", "bindNew", "contact", "Ldev/octoshrimpy/quik/model/Contact;", "bindPerson", "bindRecent", "conversation", "Ldev/octoshrimpy/quik/model/Conversation;", "bindStarred", "createRecipient", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDetachedFromRecyclerView", "presentation_noAnalyticsRelease"})
public final class ComposeItemAdapter extends dev.octoshrimpy.quik.common.base.QkAdapter<dev.octoshrimpy.quik.feature.compose.editing.ComposeItem> {
    private final dev.octoshrimpy.quik.common.util.Colors colors = null;
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.feature.compose.editing.ComposeItem> clicks = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.feature.compose.editing.ComposeItem> longClicks = null;
    private final androidx.recyclerview.widget.RecyclerView.RecycledViewPool numbersViewPool = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull
    private java.util.Map<java.lang.String, ? extends dev.octoshrimpy.quik.model.Recipient> recipients;
    
    @javax.inject.Inject
    public ComposeItemAdapter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors colors, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.feature.compose.editing.ComposeItem> getClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.feature.compose.editing.ComposeItem> getLongClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, dev.octoshrimpy.quik.model.Recipient> getRecipients() {
        return null;
    }
    
    public final void setRecipients(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends dev.octoshrimpy.quik.model.Recipient> value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.common.base.QkViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.base.QkViewHolder holder, int position) {
    }
    
    private final void bindNew(dev.octoshrimpy.quik.common.base.QkViewHolder holder, dev.octoshrimpy.quik.model.Contact contact) {
    }
    
    private final void bindRecent(dev.octoshrimpy.quik.common.base.QkViewHolder holder, dev.octoshrimpy.quik.model.Conversation conversation, dev.octoshrimpy.quik.feature.compose.editing.ComposeItem prev) {
    }
    
    private final void bindStarred(dev.octoshrimpy.quik.common.base.QkViewHolder holder, dev.octoshrimpy.quik.model.Contact contact, dev.octoshrimpy.quik.feature.compose.editing.ComposeItem prev) {
    }
    
    private final void bindGroup(dev.octoshrimpy.quik.common.base.QkViewHolder holder, dev.octoshrimpy.quik.model.ContactGroup group, dev.octoshrimpy.quik.feature.compose.editing.ComposeItem prev) {
    }
    
    private final void bindPerson(dev.octoshrimpy.quik.common.base.QkViewHolder holder, dev.octoshrimpy.quik.model.Contact contact, dev.octoshrimpy.quik.feature.compose.editing.ComposeItem prev) {
    }
    
    private final dev.octoshrimpy.quik.model.Recipient createRecipient(dev.octoshrimpy.quik.model.Contact contact) {
        return null;
    }
    
    @java.lang.Override
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override
    protected boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.editing.ComposeItem old, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.editing.ComposeItem p1_54480) {
        return false;
    }
    
    @java.lang.Override
    protected boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.editing.ComposeItem old, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.editing.ComposeItem p1_54480) {
        return false;
    }
}