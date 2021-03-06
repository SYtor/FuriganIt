package ua.syt0r.furiganit.model.repository.hisotry.local

import io.reactivex.Completable
import io.reactivex.Flowable
import ua.syt0r.furiganit.model.entity.HistoryItem

interface LocalHistoryRepository {

    fun add(historyItem: HistoryItem): Completable
    fun addAll(history: List<HistoryItem>): Completable

    fun remove(historyItem: HistoryItem): Completable
    fun removeAll(): Completable

    fun fetchHistory(): Flowable<List<HistoryItem>>

}
