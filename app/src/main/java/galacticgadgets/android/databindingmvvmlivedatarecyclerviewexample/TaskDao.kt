package galacticgadgets.android.databindingmvvmlivedatarecyclerviewexample

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TaskDao {

    @Query("SELECT * FROM task")
    fun getAll(): LiveData<List<Task>>

    @Query("SELECT * FROM task WHERE id IN (:taskIds)")
    fun loadAllByIds(taskIds: IntArray): LiveData<List<Task>>

    @Query("SELECT * FROM task WHERE task_name LIKE :name")
    fun findByName(name: String): Task

    @Update
    fun updateName(task: Task)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTask(task: Task)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg users: Task)

    @Delete
    fun delete(user: Task)

}