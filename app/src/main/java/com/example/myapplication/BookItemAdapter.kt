import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Book
import com.example.myapplication.R

class BookItemAdapter(private val books: List<Book>) : RecyclerView.Adapter<BookItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item_book, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = books[position]
        holder.tvBook.text = book.title  // Assuming `Book` has a `title` property
        holder.tvBackPrint.text = book.genre  // Assuming `Book` has a `genre` property
    }

    override fun getItemCount(): Int {
        return books.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvBook: TextView = itemView.findViewById(R.id.tvBook)
        val tvBackPrint: TextView = itemView.findViewById(R.id.tvBackPrint)
    }
}
