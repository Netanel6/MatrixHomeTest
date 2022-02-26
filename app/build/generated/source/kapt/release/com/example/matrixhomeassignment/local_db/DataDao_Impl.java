package com.example.matrixhomeassignment.local_db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DataDao_Impl implements DataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FruitEntity> __insertionAdapterOfFruitEntity;

  public DataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFruitEntity = new EntityInsertionAdapter<FruitEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `fruit` (`fruitName`,`fruitImage`,`fruitDesc`,`fruitPrice`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FruitEntity value) {
        if (value.getFruitName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getFruitName());
        }
        if (value.getFruitImage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFruitImage());
        }
        if (value.getFruitDesc() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFruitDesc());
        }
        stmt.bindLong(4, value.getFruitPrice());
      }
    };
  }

  @Override
  public void insert(final FruitEntity data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFruitEntity.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<FruitEntity>> getData() {
    final String _sql = "SELECT * FROM fruit";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"fruit"}, false, new Callable<List<FruitEntity>>() {
      @Override
      public List<FruitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFruitName = CursorUtil.getColumnIndexOrThrow(_cursor, "fruitName");
          final int _cursorIndexOfFruitImage = CursorUtil.getColumnIndexOrThrow(_cursor, "fruitImage");
          final int _cursorIndexOfFruitDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "fruitDesc");
          final int _cursorIndexOfFruitPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "fruitPrice");
          final List<FruitEntity> _result = new ArrayList<FruitEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FruitEntity _item;
            final String _tmpFruitName;
            if (_cursor.isNull(_cursorIndexOfFruitName)) {
              _tmpFruitName = null;
            } else {
              _tmpFruitName = _cursor.getString(_cursorIndexOfFruitName);
            }
            final String _tmpFruitImage;
            if (_cursor.isNull(_cursorIndexOfFruitImage)) {
              _tmpFruitImage = null;
            } else {
              _tmpFruitImage = _cursor.getString(_cursorIndexOfFruitImage);
            }
            final String _tmpFruitDesc;
            if (_cursor.isNull(_cursorIndexOfFruitDesc)) {
              _tmpFruitDesc = null;
            } else {
              _tmpFruitDesc = _cursor.getString(_cursorIndexOfFruitDesc);
            }
            final int _tmpFruitPrice;
            _tmpFruitPrice = _cursor.getInt(_cursorIndexOfFruitPrice);
            _item = new FruitEntity(_tmpFruitName,_tmpFruitImage,_tmpFruitDesc,_tmpFruitPrice);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
