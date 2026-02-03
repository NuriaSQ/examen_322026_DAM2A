package cat.itic.examen

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TascaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val tvTitle: TextView = itemView.findViewById(R.id.tvNom)
    private val tvSubtitle: TextView = itemView.findViewById(R.id.tvCategoria)
    private val tvData: TextView = itemView.findViewById(R.id.tvData)
    private val tvEstat: TextView = itemView.findViewById(R.id.tvEstat)


}

