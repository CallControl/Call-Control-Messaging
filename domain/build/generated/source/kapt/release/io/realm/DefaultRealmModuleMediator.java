package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(10);
        modelClasses.add(dev.octoshrimpy.quik.model.SyncLog.class);
        modelClasses.add(dev.octoshrimpy.quik.model.ScheduledMessage.class);
        modelClasses.add(dev.octoshrimpy.quik.model.Recipient.class);
        modelClasses.add(dev.octoshrimpy.quik.model.PhoneNumber.class);
        modelClasses.add(dev.octoshrimpy.quik.model.MmsPart.class);
        modelClasses.add(dev.octoshrimpy.quik.model.Message.class);
        modelClasses.add(dev.octoshrimpy.quik.model.Conversation.class);
        modelClasses.add(dev.octoshrimpy.quik.model.ContactGroup.class);
        modelClasses.add(dev.octoshrimpy.quik.model.Contact.class);
        modelClasses.add(dev.octoshrimpy.quik.model.BlockedNumber.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(10);
        infoMap.put(dev.octoshrimpy.quik.model.SyncLog.class, io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(dev.octoshrimpy.quik.model.ScheduledMessage.class, io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(dev.octoshrimpy.quik.model.Recipient.class, io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(dev.octoshrimpy.quik.model.PhoneNumber.class, io.realm.dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(dev.octoshrimpy.quik.model.MmsPart.class, io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(dev.octoshrimpy.quik.model.Message.class, io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(dev.octoshrimpy.quik.model.Conversation.class, io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(dev.octoshrimpy.quik.model.ContactGroup.class, io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(dev.octoshrimpy.quik.model.Contact.class, io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(dev.octoshrimpy.quik.model.BlockedNumber.class, io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
            return io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
            return io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
            return io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
            return io.realm.dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
            return io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
            return io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
            return io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
            return io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
            return io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
            return io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
            return "SyncLog";
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
            return "ScheduledMessage";
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
            return "Recipient";
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
            return "PhoneNumber";
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
            return "MmsPart";
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
            return "Message";
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
            return "Conversation";
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
            return "ContactGroup";
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
            return "Contact";
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
            return "BlockedNumber";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public Class<? extends RealmModel> getClazzImpl(String className) {
        checkClassName(className);

        if (className.equals("SyncLog")) {
            return dev.octoshrimpy.quik.model.SyncLog.class;
        }
        if (className.equals("ScheduledMessage")) {
            return dev.octoshrimpy.quik.model.ScheduledMessage.class;
        }
        if (className.equals("Recipient")) {
            return dev.octoshrimpy.quik.model.Recipient.class;
        }
        if (className.equals("PhoneNumber")) {
            return dev.octoshrimpy.quik.model.PhoneNumber.class;
        }
        if (className.equals("MmsPart")) {
            return dev.octoshrimpy.quik.model.MmsPart.class;
        }
        if (className.equals("Message")) {
            return dev.octoshrimpy.quik.model.Message.class;
        }
        if (className.equals("Conversation")) {
            return dev.octoshrimpy.quik.model.Conversation.class;
        }
        if (className.equals("ContactGroup")) {
            return dev.octoshrimpy.quik.model.ContactGroup.class;
        }
        if (className.equals("Contact")) {
            return dev.octoshrimpy.quik.model.Contact.class;
        }
        if (className.equals("BlockedNumber")) {
            return dev.octoshrimpy.quik.model.BlockedNumber.class;
        }
        throw getMissingProxyClassException(className);
    }

    @Override
    public boolean hasPrimaryKeyImpl(Class<? extends RealmModel> clazz) {
        return dev.octoshrimpy.quik.model.ScheduledMessage.class.isAssignableFrom(clazz)
                || dev.octoshrimpy.quik.model.Recipient.class.isAssignableFrom(clazz)
                || dev.octoshrimpy.quik.model.PhoneNumber.class.isAssignableFrom(clazz)
                || dev.octoshrimpy.quik.model.MmsPart.class.isAssignableFrom(clazz)
                || dev.octoshrimpy.quik.model.Message.class.isAssignableFrom(clazz)
                || dev.octoshrimpy.quik.model.Conversation.class.isAssignableFrom(clazz)
                || dev.octoshrimpy.quik.model.ContactGroup.class.isAssignableFrom(clazz)
                || dev.octoshrimpy.quik.model.Contact.class.isAssignableFrom(clazz)
                || dev.octoshrimpy.quik.model.BlockedNumber.class.isAssignableFrom(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
                return clazz.cast(new io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy());
            }
            if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
                return clazz.cast(new io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy());
            }
            if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
                return clazz.cast(new io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy());
            }
            if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
                return clazz.cast(new io.realm.dev_octoshrimpy_quik_model_PhoneNumberRealmProxy());
            }
            if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
                return clazz.cast(new io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy());
            }
            if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
                return clazz.cast(new io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy());
            }
            if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
                return clazz.cast(new io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy());
            }
            if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
                return clazz.cast(new io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy());
            }
            if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
                return clazz.cast(new io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy());
            }
            if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
                return clazz.cast(new io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
            dev_octoshrimpy_quik_model_SyncLogRealmProxy.SyncLogColumnInfo columnInfo = (dev_octoshrimpy_quik_model_SyncLogRealmProxy.SyncLogColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.SyncLog.class);
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy.copyOrUpdate(realm, columnInfo, (dev.octoshrimpy.quik.model.SyncLog) obj, update, cache, flags));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
            dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.ScheduledMessageColumnInfo columnInfo = (dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.ScheduledMessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ScheduledMessage.class);
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.copyOrUpdate(realm, columnInfo, (dev.octoshrimpy.quik.model.ScheduledMessage) obj, update, cache, flags));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
            dev_octoshrimpy_quik_model_RecipientRealmProxy.RecipientColumnInfo columnInfo = (dev_octoshrimpy_quik_model_RecipientRealmProxy.RecipientColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Recipient.class);
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy.copyOrUpdate(realm, columnInfo, (dev.octoshrimpy.quik.model.Recipient) obj, update, cache, flags));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
            dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.PhoneNumberColumnInfo columnInfo = (dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.PhoneNumberColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.PhoneNumber.class);
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.copyOrUpdate(realm, columnInfo, (dev.octoshrimpy.quik.model.PhoneNumber) obj, update, cache, flags));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
            dev_octoshrimpy_quik_model_MmsPartRealmProxy.MmsPartColumnInfo columnInfo = (dev_octoshrimpy_quik_model_MmsPartRealmProxy.MmsPartColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.MmsPart.class);
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy.copyOrUpdate(realm, columnInfo, (dev.octoshrimpy.quik.model.MmsPart) obj, update, cache, flags));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
            dev_octoshrimpy_quik_model_MessageRealmProxy.MessageColumnInfo columnInfo = (dev_octoshrimpy_quik_model_MessageRealmProxy.MessageColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Message.class);
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy.copyOrUpdate(realm, columnInfo, (dev.octoshrimpy.quik.model.Message) obj, update, cache, flags));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
            dev_octoshrimpy_quik_model_ConversationRealmProxy.ConversationColumnInfo columnInfo = (dev_octoshrimpy_quik_model_ConversationRealmProxy.ConversationColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Conversation.class);
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy.copyOrUpdate(realm, columnInfo, (dev.octoshrimpy.quik.model.Conversation) obj, update, cache, flags));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
            dev_octoshrimpy_quik_model_ContactGroupRealmProxy.ContactGroupColumnInfo columnInfo = (dev_octoshrimpy_quik_model_ContactGroupRealmProxy.ContactGroupColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.ContactGroup.class);
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy.copyOrUpdate(realm, columnInfo, (dev.octoshrimpy.quik.model.ContactGroup) obj, update, cache, flags));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
            dev_octoshrimpy_quik_model_ContactRealmProxy.ContactColumnInfo columnInfo = (dev_octoshrimpy_quik_model_ContactRealmProxy.ContactColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.Contact.class);
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy.copyOrUpdate(realm, columnInfo, (dev.octoshrimpy.quik.model.Contact) obj, update, cache, flags));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
            dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.BlockedNumberColumnInfo columnInfo = (dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.BlockedNumberColumnInfo) realm.getSchema().getColumnInfo(dev.octoshrimpy.quik.model.BlockedNumber.class);
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.copyOrUpdate(realm, columnInfo, (dev.octoshrimpy.quik.model.BlockedNumber) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public long insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
            return io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.SyncLog) object, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
            return io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.ScheduledMessage) object, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
            return io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.Recipient) object, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
            return io.realm.dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.PhoneNumber) object, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
            return io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.MmsPart) object, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
            return io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.Message) object, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
            return io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.Conversation) object, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
            return io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.ContactGroup) object, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
            return io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.Contact) object, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
            return io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.BlockedNumber) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
                io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.SyncLog) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
                io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.ScheduledMessage) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
                io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.Recipient) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
                io.realm.dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.PhoneNumber) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
                io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.MmsPart) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
                io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.Message) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
                io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.Conversation) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
                io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.ContactGroup) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
                io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.Contact) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
                io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.insert(realm, (dev.octoshrimpy.quik.model.BlockedNumber) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
                    io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
                    io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
                    io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
                    io.realm.dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
                    io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
                    io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
                    io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
                    io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
                    io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
                    io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public long insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
            return io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.SyncLog) obj, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
            return io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.ScheduledMessage) obj, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
            return io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.Recipient) obj, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
            return io.realm.dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.PhoneNumber) obj, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
            return io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.MmsPart) obj, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
            return io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.Message) obj, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
            return io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.Conversation) obj, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
            return io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.ContactGroup) obj, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
            return io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.Contact) obj, cache);
        } else if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
            return io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.BlockedNumber) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
                io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.SyncLog) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
                io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.ScheduledMessage) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
                io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.Recipient) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
                io.realm.dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.PhoneNumber) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
                io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.MmsPart) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
                io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.Message) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
                io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.Conversation) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
                io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.ContactGroup) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
                io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.Contact) object, cache);
            } else if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
                io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.insertOrUpdate(realm, (dev.octoshrimpy.quik.model.BlockedNumber) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
                    io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
                    io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
                    io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
                    io.realm.dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
                    io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
                    io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
                    io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
                    io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
                    io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
                    io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_SyncLogRealmProxy.createDetachedCopy((dev.octoshrimpy.quik.model.SyncLog) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ScheduledMessageRealmProxy.createDetachedCopy((dev.octoshrimpy.quik.model.ScheduledMessage) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_RecipientRealmProxy.createDetachedCopy((dev.octoshrimpy.quik.model.Recipient) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_PhoneNumberRealmProxy.createDetachedCopy((dev.octoshrimpy.quik.model.PhoneNumber) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_MmsPartRealmProxy.createDetachedCopy((dev.octoshrimpy.quik.model.MmsPart) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_MessageRealmProxy.createDetachedCopy((dev.octoshrimpy.quik.model.Message) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ConversationRealmProxy.createDetachedCopy((dev.octoshrimpy.quik.model.Conversation) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ContactGroupRealmProxy.createDetachedCopy((dev.octoshrimpy.quik.model.ContactGroup) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_ContactRealmProxy.createDetachedCopy((dev.octoshrimpy.quik.model.Contact) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
            return clazz.cast(io.realm.dev_octoshrimpy_quik_model_BlockedNumberRealmProxy.createDetachedCopy((dev.octoshrimpy.quik.model.BlockedNumber) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> boolean isEmbedded(Class<E> clazz) {
        if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
            return false;
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
            return false;
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
            return false;
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
            return false;
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
            return false;
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
            return false;
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
            return false;
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
            return false;
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
            return false;
        }
        if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
            return false;
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> void updateEmbeddedObject(Realm realm, E unmanagedObject, E managedObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) managedObject.getClass().getSuperclass();

        if (clazz.equals(dev.octoshrimpy.quik.model.SyncLog.class)) {
            throw getNotEmbeddedClassException("dev.octoshrimpy.quik.model.SyncLog");
        } else if (clazz.equals(dev.octoshrimpy.quik.model.ScheduledMessage.class)) {
            throw getNotEmbeddedClassException("dev.octoshrimpy.quik.model.ScheduledMessage");
        } else if (clazz.equals(dev.octoshrimpy.quik.model.Recipient.class)) {
            throw getNotEmbeddedClassException("dev.octoshrimpy.quik.model.Recipient");
        } else if (clazz.equals(dev.octoshrimpy.quik.model.PhoneNumber.class)) {
            throw getNotEmbeddedClassException("dev.octoshrimpy.quik.model.PhoneNumber");
        } else if (clazz.equals(dev.octoshrimpy.quik.model.MmsPart.class)) {
            throw getNotEmbeddedClassException("dev.octoshrimpy.quik.model.MmsPart");
        } else if (clazz.equals(dev.octoshrimpy.quik.model.Message.class)) {
            throw getNotEmbeddedClassException("dev.octoshrimpy.quik.model.Message");
        } else if (clazz.equals(dev.octoshrimpy.quik.model.Conversation.class)) {
            throw getNotEmbeddedClassException("dev.octoshrimpy.quik.model.Conversation");
        } else if (clazz.equals(dev.octoshrimpy.quik.model.ContactGroup.class)) {
            throw getNotEmbeddedClassException("dev.octoshrimpy.quik.model.ContactGroup");
        } else if (clazz.equals(dev.octoshrimpy.quik.model.Contact.class)) {
            throw getNotEmbeddedClassException("dev.octoshrimpy.quik.model.Contact");
        } else if (clazz.equals(dev.octoshrimpy.quik.model.BlockedNumber.class)) {
            throw getNotEmbeddedClassException("dev.octoshrimpy.quik.model.BlockedNumber");
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

}
