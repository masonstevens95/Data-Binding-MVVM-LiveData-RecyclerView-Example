package galacticgadgets.android.databindingmvvmlivedatarecyclerviewexample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Task {

    @PrimaryKey(autoGenerate = true)
    private var id: Long? = null

    @ColumnInfo(name = "task_name") val taskName: String? = ""
    @ColumnInfo(name = "is_checked") val isChecked: Boolean? = false


}